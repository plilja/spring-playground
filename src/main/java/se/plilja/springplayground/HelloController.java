package se.plilja.springplayground;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private FooRepository fooRepository;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/foo/create/{value}/")
    public String createFoo(@PathVariable String value, Model model) {
        Foo f = new Foo(value);
        fooRepository.save(f);
        return String.format("foo created %d\n", f.getId());
    }

    @RequestMapping("/foo/{id}/")
    public String get(@PathVariable long id, Model model) {
        Foo f = fooRepository.findOne(id);
        return String.format("foo found %d [%s]\n", f.getId(), f.getValue());
    }
}
