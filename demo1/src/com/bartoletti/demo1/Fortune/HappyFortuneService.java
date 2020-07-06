package com.bartoletti.demo1.Fortune;

import java.util.Random;

public class HappyFortuneService implements IFortuneService {
    private final String[] arrayOfFortune = {"Bad day incoming!", "Today sounds like a normal day!", "INCREDIBLE LUCKY AMAZING EXTRAORDINARY DAY!"};

    private final Random random = new Random();
    @Override
    public String getFortune() {
        return arrayOfFortune[random.nextInt(arrayOfFortune.length)];
    }
}
