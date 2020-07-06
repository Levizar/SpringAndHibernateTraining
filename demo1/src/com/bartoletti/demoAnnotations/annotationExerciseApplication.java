package com.bartoletti.demoAnnotations;

import com.bartoletti.demoAnnotations.coach.ICoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annotationExerciseApplication {
    public static void main(String[] args) {
        // load
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("com\\bartoletti\\demoAnnotations\\applicationContext.xml");
        // bean
        ICoach squashCoach = context.getBean("squashCoach", ICoach.class);
        // methods
        System.out.println(squashCoach.getDailyWorkOut());
        // close
        context.close();
    }
}