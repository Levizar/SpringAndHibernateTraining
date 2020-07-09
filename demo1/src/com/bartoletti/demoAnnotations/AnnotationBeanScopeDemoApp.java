package com.bartoletti.demoAnnotations;

import com.bartoletti.demoAnnotations.coach.ICoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {

        // load
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("com\\bartoletti\\demoAnnotations\\applicationContext.xml");
        // retrieve bean
        ICoach coach1 = context.getBean("tennisCoach",ICoach.class);
        ICoach coach2 = context.getBean("tennisCoach",ICoach.class);
        // methods
        System.out.println("Point to the same object: " + (coach1 == coach2));
        System.out.println("Memo Location for coach1: " + coach1);
        System.out.println("Memo Location for coach1: " + coach2);

        // close
        context.close();
    }
}
