package springplayground;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final Hello hello;

    @Autowired
    public HelloController(Hello hello) {
        this.hello = hello;
    }

    @RequestMapping("/")
    public String index() {
        return hello.hello();
    }
}
