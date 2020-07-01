package com.bartoletti.demo1;

import com.bartoletti.demo1.coach.ICoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {

        // Just change the applicationContext.xml to change the used file for ICoach
        // load conf
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com\\bartoletti\\demo1\\applicationContext.xml");
        //retrieve bean
        ICoach theCoach = context.getBean("myCoach", ICoach.class);
        // call methods
        System.out.println(theCoach.getDailyWorkOut());
        System.out.println(theCoach.getDailyFortune());
        // close context
        context.close();
    }
}
