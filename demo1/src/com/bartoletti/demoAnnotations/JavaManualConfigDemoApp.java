package com.bartoletti.demoAnnotations;

import com.bartoletti.demoAnnotations.coach.ICoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaManualConfigDemoApp {
    public static void main(String[] args) {
        // Read config from the java config class
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(SportManualConfig.class);
        // get beans
        ICoach swimCoach = context.getBean("swimCoach", ICoach.class);
        // call method
        System.out.println(swimCoach.getDailyWorkOut());
        System.out.println(swimCoach.getDailyFortune());
        // close context
        context.close();
    }
}
