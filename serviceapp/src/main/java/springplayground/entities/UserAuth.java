package springplayground.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import springplayground.persistance.DurationedEntity;

import javax.persistence.*;
import java.util.Collections;
import java.util.Map;

@Entity(name = "USER_AUTH")
@Table(name = "USER_AUTH")
public class UserAuth extends DurationedEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_AUTH_ID")
    private Long id;

    @Column(name = "USER_ID", nullable = false)
    private Long userId;

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID", insertable = false, updatable = false)
    private User user;

    // User is authorized for this function.
    @Column(name = "FUNCTION")
    private String function;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public User getUser() {
        return user;
    }

    public String getFunction() {
        return function;
    }

    @Override
    public DurationedEntity<Long> copy() {
        UserAuth r = new UserAuth();
        r.userId = userId;
        r.user = user;
        r.id = id;
        r.setFromDate(getFromDate());
        r.setToDate(getToDate());
        r.setExpireAt(getExpireAt());
        return r;
    }

    @Override
    public Map<String, Object> getGroupingKey() {
        return Collections.singletonMap("USER_ID", userId);
    }
}
