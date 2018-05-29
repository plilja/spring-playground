package springplayground;

import org.hamcrest.core.StringContains;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles(profiles = "test")
public class MessagesControllerTest {

    @Autowired
    private MockMvc mvc;
    @Autowired
    private JdbcTemplate template;

    @Test
    public void sqlTest() throws Exception {
        // Num rows before
        int numRowsBefore = template.queryForObject("select count(*) from message", Integer.class);
        assertEquals(0, numRowsBefore);

        // Insert data
        mvc.perform(
                MockMvcRequestBuilders
                        .post("/messages")
                        .content("{\"message\":\"hello\"}")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(StringContains.containsString("hello")));

        // Num rows after
        int numRowsAfter = template.queryForObject("select count(*) from message", Integer.class);
        assertEquals(1, numRowsAfter);

        // Query for message object
        Message message = template.queryForObject("select * from message", (resultSet, i) -> new Message()
                .setId(resultSet.getLong("id"))
                .setMessage(resultSet.getString("message")));
        assertEquals(0L, (long) message.getId());
        assertEquals("hello", message.getMessage());
    }


}
