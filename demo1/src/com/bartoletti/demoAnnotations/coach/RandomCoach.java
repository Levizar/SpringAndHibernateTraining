package com.bartoletti.demoAnnotations.coach;

import com.bartoletti.demoAnnotations.service.IFortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RandomCoach implements ICoach {

    private IFortuneService fortuneService;

    @Override
    public String getDailyWorkOut() {
        return "Do random stuff to train !";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Autowired
    public void randomMethod(IFortuneService newFortuneService){
        fortuneService = newFortuneService;
    }
}
