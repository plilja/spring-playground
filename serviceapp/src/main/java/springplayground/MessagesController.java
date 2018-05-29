package springplayground;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MessagesController {

    private final MessagesRepository messagesRepository;

    @Autowired
    public MessagesController(MessagesRepository messagesRepository) {
        this.messagesRepository = messagesRepository;
    }

    @GetMapping("/messages")
    public ResponseEntity<List<Message>> list() {
        ArrayList<Message> res = new ArrayList<>();
        for (Message m : messagesRepository.findAll()) {
            res.add(m);
        }
        return ResponseEntity.ok()
                .header("X-Total-Count", String.valueOf(res.size()))
                .header("Access-Control-Expose-Headers", "X-Total-Count")
                .body(res);
    }

    @PostMapping("/messages")
    public Message create(@RequestBody Message message) {
        return messagesRepository.save(message);
    }

    @GetMapping("/messages/{id}")
    public Message get(@PathVariable long id) {
        return messagesRepository.findOne(id);
    }
}
