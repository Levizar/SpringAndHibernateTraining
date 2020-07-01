package com.bartoletti.demo1.Fortune;

public class HappyFortuneService implements IFortuneService{
    @Override
    public String getFortune() {
        return "You are Lucky today !!!";
    }
}
