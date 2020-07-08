package com.bartoletti.demoAnnotations.coach;

import com.bartoletti.demoAnnotations.service.IFortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements ICoach {

    @Autowired
    @Qualifier("randomFortuneService")
    private IFortuneService fortuneService;

    @Override
    public String getDailyWorkOut() {
        return "Practice Tennis! (no shit!)";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
