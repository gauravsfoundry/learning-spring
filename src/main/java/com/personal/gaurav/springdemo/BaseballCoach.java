package com.personal.gaurav.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService") //using default bean name
    private FortuneService fortuneService;


    @Override
    public String getDailyWorkout(){

        return "Spend 45 minutes on batting practice";
    }


    public String getDailyFortune(){

        return "BaseBallCoach is telling you: " + fortuneService.getFortune();
    }
}
