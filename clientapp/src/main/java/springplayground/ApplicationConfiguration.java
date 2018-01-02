package springplayground;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
    @Bean
    public Hello getHello() {
        return () -> "Greetings from Spring Boot!";
    }
}
