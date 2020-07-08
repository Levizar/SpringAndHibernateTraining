package com.bartoletti.demoAnnotations.service;

import org.springframework.stereotype.Component;

@Component
public interface IFortuneService {
    String getFortune();
}
