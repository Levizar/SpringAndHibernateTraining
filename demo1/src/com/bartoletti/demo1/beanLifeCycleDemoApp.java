package com.bartoletti.demo1;

import com.bartoletti.demo1.coach.ICoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanLifeCycleDemoApp {
    public static void main(String[] args) {
        // load config
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("com\\bartoletti\\demo1\\beanLifeCycle-applicationContext.xml");

        // get beans
        ICoach myCoach = context.getBean("myCoach", ICoach.class);
        // methods
        System.out.println(myCoach.getDailyFortune());
        System.out.println(myCoach.getDailyWorkOut());
        // close context
        context.close();
    }
}
