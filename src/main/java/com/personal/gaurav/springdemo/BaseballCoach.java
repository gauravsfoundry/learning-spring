package com.personal.gaurav.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    @Autowired
    public void setFortuneService(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){

        return "Spend 45 minutes on batting practice";
    }


    public String getDailyFortune(){

        return "BaseBallCoach is telling you: " + fortuneService.getFortune();
    }
}
