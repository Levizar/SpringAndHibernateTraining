package com.bartoletti.demoAnnotations;

import com.bartoletti.demoAnnotations.coach.ICoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        // Read config from the java config class
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(SportConfig.class);
        // get beans
        ICoach myFamosoCoach = context.getBean("tennisCoach", ICoach.class);
        // call method
        System.out.println(myFamosoCoach.getDailyWorkOut());
        System.out.println(myFamosoCoach.getDailyFortune());
        // close context
        context.close();
    }
}
