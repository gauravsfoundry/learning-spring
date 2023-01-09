package com.personal.gaurav.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class HappyFortuneService implements FortuneService {

    String[] fortuneList = {
            "Today is your lucky day!",
            "Today will be a challenging day",
            "Today will be a bad day, so be careful!"
    };
    Random rand = new Random();

    @Override
    public String getFortune() {

        return fortuneList[rand.nextInt(fortuneList.length)];
    }
}
