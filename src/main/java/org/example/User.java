package org.example;
import lombok.Data;

@Data

public class User {
    private Long id;
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public User() {

    }


}
