package com.bartoletti.demoAnnotations.service;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements IFortuneService {

    @Override
    public String getFortune() {
        return null;
    }

}
