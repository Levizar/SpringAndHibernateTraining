package com.bartoletti.demo1.coach;

import com.bartoletti.demo1.Fortune.IFortuneService;

public class ClimbingCoach implements ICoach {

    private final IFortuneService fortuneService;

    public ClimbingCoach(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }


    @Override
    public String getDailyWorkOut() {
        return "Climb a mountain 3 times ! Easy peasy";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
