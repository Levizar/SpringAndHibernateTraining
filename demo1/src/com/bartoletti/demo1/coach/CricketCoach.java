package com.bartoletti.demo1.coach;

import com.bartoletti.demo1.Fortune.IFortuneService;

public class CricketCoach implements ICoach {
    private IFortuneService fortuneService;

    private String emailAddress;
    private String team;

    public CricketCoach() {
        System.out.println("CricketCoach : no-arg constructor");
    }

    // Setter method that will be call by spring for setter injection
    public void setFortuneService(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("CricketCoach : fortuneService Setter");
    }
    @Override
    public String getDailyWorkOut() {
        return "Practice fast bowling for 15 min";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        System.out.println("CricketCoach : setEmailAddress");
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
        System.out.println("CricketCoach : setTeam");
    }
}
