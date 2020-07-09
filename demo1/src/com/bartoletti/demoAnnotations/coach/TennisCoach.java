package com.bartoletti.demoAnnotations.coach;

import com.bartoletti.demoAnnotations.service.IFortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements ICoach {

    @Autowired
    @Qualifier("randomFortuneService")
    private IFortuneService fortuneService;
    {
        System.out.println("randomFortuneService was injected into tennis coach by field injection");
    }

    // Those annotation are part of Java EE and are deprecated
    // @PostConstruct
    public void initMethod(){
        System.out.println(">> TennisCoach: initMethod");
    }

    // Those annotation are part of Java EE and are deprecated
    // @PreDestroy
    public void preDestroyMethod(){
        System.out.println(">> TennisCoach: preDestroyMethod");
    }

    @Override
    public String getDailyWorkOut() {
        return "Practice Tennis! (no shit!)";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
