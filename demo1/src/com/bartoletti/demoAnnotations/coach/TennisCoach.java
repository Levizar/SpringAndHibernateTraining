package com.bartoletti.demoAnnotations.coach;

import org.springframework.stereotype.Component;

@Component("elFamosoTennisCoach")
public class TennisCoach implements ICoach {
    @Override
    public String getDailyWorkOut() {
        return "Practice Tennis! (no shit!)";
    }
}
