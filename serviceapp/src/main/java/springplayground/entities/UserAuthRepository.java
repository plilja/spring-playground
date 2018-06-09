package springplayground.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springplayground.persistance.DurationedRepository;
import springplayground.persistance.SoftDeletableRepository;

@Repository
public class UserAuthRepository extends DurationedRepository<UserAuth, Long> {
    @Autowired
    public UserAuthRepository(UserAuthCrudRepository crudRepository) {
        super(new SoftDeletableRepository<>(crudRepository));
    }
}

@Repository
interface UserAuthCrudRepository extends CrudRepository<UserAuth, Long> {

}
