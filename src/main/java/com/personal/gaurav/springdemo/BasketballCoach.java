package com.personal.gaurav.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {
    private FortuneService fortuneService;

    @Autowired
    public BasketballCoach(FortuneService fortuneService) {

        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){

        return "Dribble for at least 30 mins and shoot from the other end of the court";
    }

    public String getDailyFortune(){

        return "BasketBallCoach is telling you: " + fortuneService.getFortune();
    }
}
