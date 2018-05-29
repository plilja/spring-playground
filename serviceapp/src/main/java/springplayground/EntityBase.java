package springplayground;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public class EntityBase {
    @Column(name = "created_by_user")
    @CreatedBy
    @NotNull
    private String createdByUser;

    @CreatedDate
    @NotNull
    private LocalDateTime createdDate = LocalDateTime.now();

    @Column(name = "modified_by_user")
    @LastModifiedBy
    private String modifiedByUser;

    @Column(name = "modification_time")
    @LastModifiedDate
    private LocalDateTime modificationDate;

    public String getCreatedByUser() {
        return createdByUser;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public String getModifiedByUser() {
        return modifiedByUser;
    }

    public LocalDateTime getModificationDate() {
        return modificationDate;
    }
}
