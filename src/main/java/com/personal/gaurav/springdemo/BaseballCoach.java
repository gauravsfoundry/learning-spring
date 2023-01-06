package com.personal.gaurav.springdemo;

public class BaseballCoach implements Coach {
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
        return "Spend 45 minutes on batting practice";
    }


    public String getDailyFortune(){
        return "BaseBallCoach is telling you: " + fortuneService.getFortune();
    }
}
