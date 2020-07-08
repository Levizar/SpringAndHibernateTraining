package com.bartoletti.demoAnnotations.service;

import org.springframework.stereotype.Component;

@Component
public class DataBaseFortuneService implements IFortuneService {

    @Override
    public String getFortune() {
        return null;
    }

}
