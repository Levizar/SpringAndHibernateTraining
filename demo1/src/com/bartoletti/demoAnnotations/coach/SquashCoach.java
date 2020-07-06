package com.bartoletti.demoAnnotations.coach;

import com.bartoletti.demoAnnotations.service.IFortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SquashCoach implements ICoach {

    private final IFortuneService fortuneService;

    @Autowired
    public SquashCoach(IFortuneService fortuneService) {
        System.out.println("SquashCoach: fortuneService was injected via constructor");

        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Work your squashing squash squash plop !";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}