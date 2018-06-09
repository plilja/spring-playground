package springplayground;

import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SoftDeletableRepository<T extends SoftDeletableEntity<ID>, ID> implements CrudRepository<T, ID> {
    private final CrudRepository<T, ID> crudRepository;

    public SoftDeletableRepository(CrudRepository<T, ID> crudRepository) {
        this.crudRepository = crudRepository;
    }

    @Override
    public <S extends T> S save(S s) {
        return crudRepository.save(s);
    }

    @Override
    public <S extends T> Iterable<S> saveAll(Iterable<S> iterable) {
        ArrayList<S> res = new ArrayList<>();
        for (S s : iterable) {
            res.add(save(s));
        }
        return res;
    }

    @Override
    public Optional<T> findById(ID id) {
        return crudRepository.findById(id)
                .filter(e -> !e.isRemoved());
    }

    @Override
    public boolean existsById(ID id) {
        return findById(id).isPresent();
    }

    public List<T> findAll() {
        ArrayList<T> res = new ArrayList<>();
        LocalDateTime now = LocalDateTime.now();
        for (T t : crudRepository.findAll()) {
            if (!t.isRemoved()) {
                res.add(t);
            }
        }
        return res;
    }

    @Override
    public Iterable<T> findAllById(Iterable<ID> iterable) {
        ArrayList<T> res = new ArrayList<>();
        for (ID id : iterable) {
            findById(id)
                    .ifPresent(e -> res.add(e));
        }
        return res;
    }

    @Override
    public long count() {
        return findAll().size();
    }

    @Override
    public void deleteById(ID id) {
        findById(id).ifPresent(e -> delete(e));
    }

    @Override
    public void delete(T t) {
        t.setExpireAt(LocalDateTime.now());
        save(t);

    }

    @Override
    public void deleteAll(Iterable<? extends T> iterable) {
        for (T t : iterable) {
            delete(t);
        }
    }

    @Override
    public void deleteAll() {
        for (T t : findAll()) {
            delete(t);
        }
    }

    public List<T> recycleBin() {
        ArrayList<T> res = new ArrayList<>();
        for (T t : crudRepository.findAll()) {
            if (t.isRemoved()) {
                res.add(t);
            }
        }
        return res;
    }

}
