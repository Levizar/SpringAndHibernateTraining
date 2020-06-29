package com.bartoletti.demo1;

public class MyApp {
    public static void main(String[] args) {
        ICoach theCoach = new TrackCoach();
        System.out.println(theCoach.getDailyWorkOut());
    }
}
