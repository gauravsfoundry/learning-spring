package com.personal.gaurav.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService") //using default bean name
    private FortuneService fortuneService;


    @Override
    public String getDailyWorkout(){

        return "Dribble for at least 30 mins and shoot from the other end of the court";
    }

    public String getDailyFortune(){

        return "BasketBallCoach is telling you: " + fortuneService.getFortune();
    }
}
