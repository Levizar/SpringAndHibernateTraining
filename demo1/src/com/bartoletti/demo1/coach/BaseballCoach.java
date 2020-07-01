package com.bartoletti.demo1.coach;

import com.bartoletti.demo1.Fortune.IFortuneService;
import com.bartoletti.demo1.coach.ICoach;

public class BaseballCoach implements ICoach {

    // define the private field for dependency injection
    private final IFortuneService fortuneService;

    // allow the dependency injection
    public BaseballCoach(IFortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Spend 30 min batting practice";
    }

    @Override
    public String getDailyFortune() {

        // call the service fortuneService
        return fortuneService.getFortune();
    }
}
