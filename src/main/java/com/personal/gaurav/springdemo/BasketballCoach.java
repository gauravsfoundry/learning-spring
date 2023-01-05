package com.personal.gaurav.springdemo;

public class BasketballCoach implements Coach {
    private FortuneService fortuneService;

    public BasketballCoach(FortuneService fortuneService){
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
