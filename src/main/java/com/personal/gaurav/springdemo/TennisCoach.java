package com.personal.gaurav.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //Omitted bean id with annotation. Bean id is class name with first letter converted to small case i.e. tennisCoach
public class TennisCoach implements Coach {

    @Value("${myEmailAddress}")
    private String emailAddress;

    @Value("${myTeamName}")
    private String teamName;

    @Autowired
    @Qualifier("randomFortuneService") //using default bean name
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {

        return "Practice forehand smash for 30 mins";
    }

    @Override
    public String getDailyFortune() {

        return "TennisCoach is telling you: " + fortuneService.getFortune() ;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeamName() {
        return teamName;
    }
}
