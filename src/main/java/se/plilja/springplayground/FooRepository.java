package se.plilja.springplayground;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FooRepository extends CrudRepository<Foo, Long> {

}
