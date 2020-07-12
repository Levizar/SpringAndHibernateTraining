package com.bartoletti.demoAnnotations.coach;

import com.bartoletti.demoAnnotations.service.IFortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * For this class we will inject the bean with the java config file
 */
public class SwimCoach implements ICoach {

    IFortuneService fortuneService;

    public SwimCoach(IFortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Swim 1Km as a warm Up";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
