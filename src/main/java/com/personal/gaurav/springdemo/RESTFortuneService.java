package com.personal.gaurav.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "This fortune is coming from a REST service!";
    }
}
