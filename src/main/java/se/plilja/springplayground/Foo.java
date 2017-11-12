package se.plilja.springplayground;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Foo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String value;

    protected Foo() {}

    public Foo(String value) {
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public String getValue() {
        return value;
    }
}
