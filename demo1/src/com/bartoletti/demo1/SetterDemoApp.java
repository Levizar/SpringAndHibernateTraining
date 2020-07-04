package com.bartoletti.demo1;

import com.bartoletti.demo1.coach.CricketCoach;
import com.bartoletti.demo1.coach.ICoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {

        //load Conf
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com\\bartoletti\\demo1\\applicationContext.xml");

        //retrieve bean
        CricketCoach myCoach = context.getBean("myCricketCoach", CricketCoach.class);

        //call methods
        System.out.println(myCoach.getDailyWorkOut());
        System.out.println(myCoach.getDailyFortune());

        //call methods with the injected values
        System.out.println(myCoach.getTeam());
        System.out.println(myCoach.getEmailAddress());

        //close context
        context.close();
    }
}
