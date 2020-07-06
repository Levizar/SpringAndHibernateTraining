package com.bartoletti.demoAnnotations;

import com.bartoletti.demoAnnotations.coach.ICoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annotationDemoApp {
    public static void main(String[] args) {

        // load conf
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("com\\bartoletti\\demoAnnotations\\applicationContext.xml");
        // get beans
        ICoach myFamosoCoach = context.getBean("tennisCoach", ICoach.class);
        // call method
        System.out.println(myFamosoCoach.getDailyWorkOut());
        System.out.println(myFamosoCoach.getDailyFortune());
        // close context
        context.close();
    }
}
