package com.bartoletti.demo1;

import com.bartoletti.demo1.coach.ICoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        //load Conf
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com\\bartoletti\\demo1\\applicationContext.xml");
        //retrieve bean
        ICoach myCoach = context.getBean("myCricketCoach",ICoach.class);
        //call methods
        System.out.println(myCoach.getDailyWorkOut());
        System.out.println(myCoach.getDailyFortune());
        //close context
        context.close();
    }
}
