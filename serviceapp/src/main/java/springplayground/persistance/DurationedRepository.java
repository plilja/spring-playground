package springplayground.persistance;

import java.util.List;

public class DurationedRepository<T extends DurationedEntity<ID>, ID> {
    private final SoftDeletableRepository<T, ID> crudRepository;

    public DurationedRepository(SoftDeletableRepository<T, ID> crudRepository) {
        this.crudRepository = crudRepository;
    }

    public T get(ID id) {
        return crudRepository.findById(id).get();
    }

    public List<T> findAll() {
        return crudRepository.findAll();
    }

    public T save(T newObject) {
        for (T existing : crudRepository.findAll()) {
            if (newObject.getGroupingKey().equals(existing.getGroupingKey())) {
                if (existing.getFromDate().compareTo(newObject.getFromDate()) <= 0) {
                    if (existing.getToDate().isAfter(newObject.getToDate())) {
                        T c = (T) existing.copy();
                        c.setId(null);
                        c.setFromDate(newObject.getToDate());
                        crudRepository.save(c);

                        existing.setToDate(newObject.getFromDate());
                        crudRepository.save(existing);
                    } else if (existing.getToDate().isAfter(newObject.getFromDate())) {
                        existing.setToDate(newObject.getFromDate());
                        crudRepository.save(existing);
                    }
                } else if (existing.getFromDate().compareTo(newObject.getToDate()) < 0) {
                    if (existing.getToDate().compareTo(newObject.getToDate()) <= 0) {
                        crudRepository.delete(existing);
                    } else {
                        assert existing.getToDate().isAfter(newObject.getToDate());
                        existing.setFromDate(existing.getToDate());
                        crudRepository.save(existing);
                    }
                }
            }
        }
        return crudRepository.save(newObject);
    }

}
