package springplayground;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Hello hello;

    @Autowired
    private FooRepository fooRepository;

    @RequestMapping("/")
    public String index() {
        return hello.hello();
    }

    @RequestMapping("/foo/create/{value}/")
    public String createFoo(@PathVariable String value, Model model) {
        Foo f = new Foo().value(value);
        fooRepository.save(f);
        return String.format("foo created %d\n", f.id());
    }

    @RequestMapping("/foo/{id}/")
    public String get(@PathVariable long id, Model model) {
        Foo f = fooRepository.findOne(id);
        return String.format("foo found %d %s %s %s\n", f.id(), f.value(), f.getCreatedByUser(), f.getCreatedDate());
    }
}
