package springplayground.entities;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springplayground.BaseController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/users")
public class UserController extends BaseController<User, Long> {
}
