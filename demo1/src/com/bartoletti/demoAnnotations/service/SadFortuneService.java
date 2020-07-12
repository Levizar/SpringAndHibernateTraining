package com.bartoletti.demoAnnotations.service;

public class SadFortuneService implements IFortuneService {

    @Override
    public String getFortune() {
        return "Sad fortune today !";
    }
}
