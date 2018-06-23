package springplayground;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseController<T, ID> {

    @Autowired
    private CrudRepository<T, ID> repo;

    @ApiOperation(value = "list", nickname = "list")
    @GetMapping
    public ResponseEntity<List<T>> list() {
        ArrayList<T> res = new ArrayList<>();
        for (T m : repo.findAll()) {
            res.add(m);
        }
        return ResponseEntity.ok()
                .header("X-Total-Count", String.valueOf(res.size()))
                .header("Access-Control-Expose-Headers", "X-Total-Count")
                .body(res);
    }

    @ApiOperation(value = "create", nickname = "create")
    @PostMapping
    public T create(@RequestBody T message) {
        return repo.save(message);
    }

    @ApiOperation(value = "delete", nickname = "delete")
    @DeleteMapping(value = "{id}", name = "delete")
    public void delete(@PathVariable ID id) {
        repo.deleteById(id);
    }

    @ApiOperation(value = "get", nickname = "get")
    @GetMapping("{id}")
    public T get(@PathVariable ID id) {
        return repo.findById(id).get();
    }
}
