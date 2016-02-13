package com.example;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

import static org.apache.log4j.Logger.getLogger;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class HelloController {

    private Logger log = getLogger(HelloController.class);

    @Autowired
    private GreetingRepository repository;

    @RequestMapping(value = "/", method = GET)
    public String hello(@RequestParam(value = "person", required = false, defaultValue = "nobody") String person) {
        log.info("I will be greeting " + person + " soon");

        Greeting greeting = new Greeting(person, Instant.now().toEpochMilli());
        repository.save(greeting);
        return "hello " + person;
    }
}
