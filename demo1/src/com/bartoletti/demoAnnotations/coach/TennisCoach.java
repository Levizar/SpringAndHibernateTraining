package com.bartoletti.demoAnnotations.coach;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements ICoach {
    @Override
    public String getDailyWorkOut() {
        return "Practice Tennis! (no shit!)";
    }
}
