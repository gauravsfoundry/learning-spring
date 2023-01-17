package com.personal.gaurav.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do a breast stroke for 200 meters";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();
    }
}
