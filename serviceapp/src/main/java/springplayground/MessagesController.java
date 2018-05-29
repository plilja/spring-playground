package springplayground;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessagesController {

    private final MessagesRepository messagesRepository;

    @Autowired
    public MessagesController(MessagesRepository messagesRepository) {
        this.messagesRepository = messagesRepository;
    }

    @PostMapping("/messages")
    public Message createMessage(@RequestBody Message message) {
        return messagesRepository.save(message);
    }

    @GetMapping("/messages/{id}")
    public Message get(@PathVariable long id) {
        return messagesRepository.findOne(id);
    }
}
