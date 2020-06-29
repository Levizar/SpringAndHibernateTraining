package com.bartoletti.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // load conf
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com\\bartoletti\\demo1\\applicationContext.xml");
        //retrieve bean
        ICoach theCoach = context.getBean("myCoach", ICoach.class);
        // call methods
        System.out.println(theCoach.getDailyWorkOut());
        // close context
        context.close();
    }
}
