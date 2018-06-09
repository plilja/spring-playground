package springplayground.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springplayground.BaseController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/users")
public class UserController extends BaseController<User, Long> {
    @Autowired
    private UsersRepository repo;

    @GetMapping("/removed")
    public ResponseEntity<List<User>> list() {
        List<User> res = repo.recycleBin();
        return ResponseEntity.ok()
                .header("X-Total-Count", String.valueOf(res.size()))
                .header("Access-Control-Expose-Headers", "X-Total-Count")
                .body(res);
    }
}
