package se.plilja.springplayground;

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

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles(profiles = "test")
public class HelloControllerTest {

    @Autowired
    private MockMvc mvc;
    @Autowired
    private JdbcTemplate template;

    @Test
    public void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Greetings from a test case")));
    }

    @Test
    public void sqlTest() throws Exception {
        // Num rows before
        int numRowsBefore = template.queryForObject("select count(*) from foo", Integer.class);
        assertEquals(0, numRowsBefore);

        // Insert data
        mvc.perform(MockMvcRequestBuilders.get("/foo/create/hej/").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("foo created 1\n")));

        // Num rows after
        int numRowsAfter = template.queryForObject("select count(*) from foo", Integer.class);
        assertEquals(1, numRowsAfter);

        // Query for foo object
        Foo foo = template.queryForObject("select * from foo", (resultSet, i) -> new Foo()
                .id(resultSet.getLong("id"))
                .value(resultSet.getString("value")));
        assertEquals(1L, (long) foo.id());
        assertEquals("hej", foo.value());
    }
}
