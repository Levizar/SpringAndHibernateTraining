package com.bartoletti.demoAnnotations;

import com.bartoletti.demoAnnotations.coach.ICoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annotationAndPlaceHolderExerciseApp {
    public static void main(String[] args) {
        // load context
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("com\\bartoletti\\demoAnnotations\\applicationContext.xml");
        // retrieve bean
        ICoach climbingCoach = context.getBean("climbingCoach", ICoach.class);
        // method of bean
        System.out.println(climbingCoach.getDailyWorkOut());
        System.out.println(climbingCoach.getDailyFortune());
        // close context
        context.close();
    }
}
