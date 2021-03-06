package com.bartoletti.demo1.coach;

import com.bartoletti.demo1.Fortune.IFortuneService;

public class TrackCoach implements ICoach {

    private final IFortuneService fortuneService;

    public TrackCoach(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // init method
    public void doMyStartupStuff(){
        System.out.println("TrackCoach: init method");
    }

    // destroy method
    public void doMyDestroyStuff(){
        System.out.println("TrackCoach: destroy method");
    }
}
