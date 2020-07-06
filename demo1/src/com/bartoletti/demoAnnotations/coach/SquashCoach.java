package com.bartoletti.demoAnnotations.coach;

import org.springframework.stereotype.Component;

@Component
public class SquashCoach implements ICoach{
    @Override
    public String getDailyWorkOut() {
        return "Work your squashing squash squash plop !";
    }
}
