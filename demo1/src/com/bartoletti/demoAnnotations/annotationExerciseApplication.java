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
        ICoach anotherCoach = context.getBean("anotherCoach", ICoach.class);

        // methods
        System.out.println(squashCoach.getDailyWorkOut());
        System.out.println(squashCoach.getDailyFortune());
        System.out.println(anotherCoach.getDailyWorkOut());
        System.out.println(anotherCoach.getDailyFortune());

        // close
        context.close();
    }
}