package com.example;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class Greeting {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private Date date;

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    public Greeting() {}

    public Greeting(String name, Date date) {
        this.name = name;
        this.date = date;
    }
}
