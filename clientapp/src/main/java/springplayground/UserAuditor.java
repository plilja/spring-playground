package springplayground;

import org.springframework.data.domain.AuditorAware;

public class UserAuditor implements AuditorAware<String> {
    @Override
    public String getCurrentAuditor() {
        return "plilja"; // hard coded because I don't want to configure spring security right now
    }
}
