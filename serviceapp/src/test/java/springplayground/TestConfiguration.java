package springplayground;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import springplayground.hello.Hello;

@Configuration
public class TestConfiguration {
    @Bean
    @Primary
    public Hello testHello() {
        return () -> "Greetings from a test case";
    }
}
