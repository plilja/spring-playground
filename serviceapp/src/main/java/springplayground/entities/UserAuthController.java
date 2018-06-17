package springplayground.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user-auths")
public class UserAuthController {

    @Autowired
    private UserAuthRepository repo;

    @GetMapping
    public ResponseEntity<List<UserAuth>> list() {
        ArrayList<UserAuth> res = new ArrayList<>();
        for (UserAuth ua : repo.findAll()) {
            res.add(ua);
        }
        return ResponseEntity.ok()
                .header("X-Total-Count", String.valueOf(res.size()))
                .header("Access-Control-Expose-Headers", "X-Total-Count")
                .body(res);
    }

    @PostMapping
    public UserAuth create(@RequestBody UserAuth message) {
        return repo.save(message);
    }

    @GetMapping("{id}")
    public UserAuth get(@PathVariable long id) {
        return repo.get(id);
    }

}
