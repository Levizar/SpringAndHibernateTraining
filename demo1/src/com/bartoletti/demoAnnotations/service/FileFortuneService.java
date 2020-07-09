package com.bartoletti.demoAnnotations.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class FileFortuneService implements IFortuneService {

    @Value(("${foo.fortune}"))
    private String[] arrayOfFortune;

    private final Random random = new Random();

    @Override
    public String getFortune() {
        return arrayOfFortune[random.nextInt(arrayOfFortune.length)];
    }
}
