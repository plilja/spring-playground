package springplayground.entities;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface UsersRepository extends CrudRepository<User, Long> {
}
