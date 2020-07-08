package com.bartoletti.demoAnnotations.service;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements IFortuneService {

    private final String[] arrayOfFortune = {
            "Bad day incoming!",
            "Today sounds like a normal day!",
            "INCREDIBLE LUCKY AMAZING EXTRAORDINARY DAY!"
    };
    private final Random random = new Random();

    @Override
    public String getFortune() {
        return arrayOfFortune[random.nextInt(arrayOfFortune.length)];
    }

}
