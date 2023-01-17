package com.personal.gaurav.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${myEmailAddress}")
    private String emailAddress;

    @Value("${myTeamName}")
    private String teamName;

    public SwimCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do a breast stroke for 200 meters";
    }

    @Override
    public String getDailyFortune() {

        return "SwimCoach is telling you: " + fortuneService.getFortune();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeamName() {
        return teamName;
    }
}
