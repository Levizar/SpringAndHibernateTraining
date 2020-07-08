package com.bartoletti.demoAnnotations.service;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements IFortuneService {
    @Override
    public String getFortune() {
        return "Lucky Day inComing";
    }
}
