package springplayground.config;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class UserAuditor implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("plilja"); // hard coded because I don't want to configure spring security right now
    }
}
