package com.bartoletti.demo1.coach;

import com.bartoletti.demo1.Fortune.IFortuneService;

public class CricketCoach implements ICoach {
    private IFortuneService fortuneService;

    public CricketCoach() {
        System.out.println("CricketCoach : no-arg constructor");
    }

    // Setter method that will be call by spring for setter inection
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
}
