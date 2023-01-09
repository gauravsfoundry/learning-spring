package com.personal.gaurav.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    String[] fortuneList = {
            "Try, try, try but never say die!",
            "Just do it!",
            "It's all about journey and not the destination!"
    };
    Random rand = new Random();

    @Override
    public String getFortune() {

        return fortuneList[rand.nextInt(fortuneList.length)];
    }
}
