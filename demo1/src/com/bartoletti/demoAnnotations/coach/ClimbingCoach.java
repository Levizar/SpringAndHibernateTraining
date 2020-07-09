package com.bartoletti.demoAnnotations.coach;

import com.bartoletti.demoAnnotations.service.IFortuneService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClimbingCoach implements ICoach {

    private final IFortuneService fortuneService;

    ClimbingCoach(@Qualifier("fileFortuneService") IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "CLIMB CLIMB CLIMB CLIMB CLIMB !";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
