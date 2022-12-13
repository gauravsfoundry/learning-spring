package com.personal.gaurav.springdemo;

public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout(){
        return "Spend 45 minutes on batting practice";
    }
}
