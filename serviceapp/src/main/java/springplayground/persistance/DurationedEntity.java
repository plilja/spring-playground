package springplayground.persistance;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;
import java.util.Map;

@MappedSuperclass
public abstract class DurationedEntity<ID> extends BaseEntity<ID> {
    @Column(name = "FROM_DATE")
    private LocalDate fromDate;

    @Column(name = "TO_DATE")
    private LocalDate toDate;

    public LocalDate getFromDate() {
        return fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public abstract DurationedEntity<ID> copy();

    /**
     * Tells what we are grouping the durations on.
     */
    @JsonIgnore
    public abstract Map<String, Object> getGroupingKey();
}
