package com.example;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.apache.log4j.Logger.getLogger;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class HelloController {
    private Logger log = getLogger(HelloController.class);
    @RequestMapping(value = "/", method = GET)
    public String hello() {
        log.info("I will be greeting you soon");
        return "hello dev nexus!";
    }
}
