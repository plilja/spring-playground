package springplayground.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import springplayground.hello.Hello;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class ApplicationConfiguration {
    @Bean
    public Hello getHello() {
        return () -> "Greetings from Spring Boot!";
    }

    @Bean
    AuditorAware<String> auditorProvider() {
        return new UserAuditor();
    }

}
