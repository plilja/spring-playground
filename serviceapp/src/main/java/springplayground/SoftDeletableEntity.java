package springplayground;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class SoftDeletableEntity<ID> extends BaseEntity<ID> {

    @Column(name = "EXPIRE_AT")
    private LocalDateTime expireAt;

    @PrePersist
    void preInsert() {
        if (expireAt == null) {
            expireAt = LocalDateTime.of(9999, 12, 31, 0, 0, 0, 0);
        }
    }

    public void setExpireAt(LocalDateTime expireAt) {
        this.expireAt = expireAt;
    }

    public LocalDateTime getExpireAt() {
        return expireAt;
    }

    @JsonIgnore
    public boolean isRemoved() {
        LocalDateTime now = LocalDateTime.now();
        return getExpireAt().compareTo(now) <= 0;
    }
}
