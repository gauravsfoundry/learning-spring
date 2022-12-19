package com.personal.gaurav.springdemo;

public class BasketballCoach implements Coach {
    @Override
    public String getDailyWorkout(){

        return "Dribble for at least 30 mins and shoot from the other end of the court";
    }
}
