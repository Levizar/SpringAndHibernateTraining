package com.bartoletti.demo1;

import com.bartoletti.demo1.coach.ICoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeDemoApp {
    public static void main(String[] args) {

        //load spring configuration
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("com\\bartoletti\\demo1\\beanScope-applicationContext.xml");
        // retrieve bean from container
        ICoach theCoach = context.getBean("myCoach", ICoach.class);
        ICoach alphaCoach = context.getBean("myCoach", ICoach.class);


        // Check if it is the same object
        // If singleton -> Same Object
        // If Prototype -> Different Object
        System.out.println("Do the object have the same reference? " + (theCoach == alphaCoach));
        System.out.println("theCoach's reference: " + theCoach);
        System.out.println("alphaCoach's reference: " + alphaCoach);



        context.close();
    }
}
