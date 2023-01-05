package com.personal.gaurav.springdemo;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
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
