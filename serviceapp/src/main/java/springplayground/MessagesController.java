package springplayground;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class MessagesController {

    private final MessagesRepository messagesRepository;

    @Autowired
    public MessagesController(MessagesRepository messagesRepository) {
        this.messagesRepository = messagesRepository;
    }

    @RequestMapping("/messages/create/{value}/")
    public String createMessage(@PathVariable String value, Model model) {
        Message f = new Message().message(value);
        messagesRepository.save(f);
        return String.format("Message created %d\n", f.id());
    }

    @RequestMapping("/{id}/")
    public String get(@PathVariable long id, Model model) {
        Message f = messagesRepository.findOne(id);
        return String.format("Message found %d %s %s %s\n", f.id(), f.message(), f.getCreatedByUser(), f.getCreatedDate());
    }
}
