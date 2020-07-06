package com.bartoletti.demoAnnotations.service;

import org.springframework.stereotype.Component;

@Component("fortuneService")
public class FortuneService implements IFortuneService {
    @Override
    public String getFortune() {
        return "Lucky Day inComing";
    }
}
