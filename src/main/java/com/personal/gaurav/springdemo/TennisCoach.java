package com.personal.gaurav.springdemo;

import org.springframework.stereotype.Component;

@Component //Omitted bean id with annotation. Bean id is class name with first letter converted to small case i.e. tennisCoach
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice forehand smash for 30 mins";
    }

    @Override
    public String getDailyFortune() {

        return "Toady is your lucky day";
    }
}
