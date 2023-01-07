package com.personal.gaurav.springdemo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;
    private String emailAddress;
    private String teamName;

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setEmailAddress(String emailAddress) {

        this.emailAddress = emailAddress;
    }

    public void setTeamName(String teamName) {

        this.teamName = teamName;
    }

    public void setFortuneService(FortuneService fortuneService) {

        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){

        return "Run a hard 5K";
    }

    @Override
    public String getDailyFortune() {

        return "TrackCoach is telling you: " + fortuneService.getFortune();
    }

    public void myStartupMethod(){
        System.out.println("Inside TrackCoach init method");
    }

    public void myExitMethod(){
        System.out.println("Inside TrackCoach destroy method");
    }
}
