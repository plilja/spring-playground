package springplayground;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public class UsersRepository extends SoftDeletableRepository<User, Long> {
    @Autowired
    public UsersRepository(UsersCrudRepository usersCrudRepository) {
        super(usersCrudRepository);
    }
}

@Repository
interface UsersCrudRepository extends CrudRepository<User, Long> {
}
