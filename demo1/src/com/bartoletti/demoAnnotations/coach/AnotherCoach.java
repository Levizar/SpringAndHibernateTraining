package com.bartoletti.demoAnnotations.coach;

import com.bartoletti.demoAnnotations.service.HappyFortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnotherCoach implements ICoach {

    private HappyFortuneService happyFortuneService;

    @Autowired
    public void setHappyFortuneService(HappyFortuneService happyFortuneService) {
        System.out.println("AnotherCoach: fortuneService was injected via Setter");
        this.happyFortuneService = happyFortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Another Training";
    }

    @Override
    public String getDailyFortune() {
        return happyFortuneService.getFortune();
    }
}
