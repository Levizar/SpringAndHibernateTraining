package com.bartoletti.demoAnnotations.coach;

import com.bartoletti.demo1.Fortune.IFortuneService;
import com.bartoletti.demoAnnotations.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnotherCoach implements ICoach {

    private FortuneService fortuneService;

    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("AnotherCoach: fortuneService was injected via Setter");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Another Training";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
