package com.personal.gaurav.springdemo;

public class BasketballCoach implements Coach {
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
        return "Dribble for at least 30 mins and shoot from the other end of the court";
    }

    public String getDailyFortune(){
        return "BasketBallCoach is telling you: " + fortuneService.getFortune();
    }
}
