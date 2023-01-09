package com.personal.gaurav.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    @Autowired
    public void setFortuneService(FortuneService fortuneService) {

        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){

        return "Run a hard 5K";
    }

    @Override
    public String getDailyFortune() {

        return "TrackCoach is telling you: " + fortuneService.getFortune();
    }

}
