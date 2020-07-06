package com.bartoletti.demoAnnotations.coach;

import com.bartoletti.demoAnnotations.service.IFortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldInjectedCoach implements ICoach {

    @Autowired
    private IFortuneService fortuneService;

    @Override
    public String getDailyWorkOut() {
        return "fieldInject stuff to train";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
