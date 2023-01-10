package com.personal.gaurav.springdemo;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    Random rand = new Random();

    //Read predictions from a file
    public String[] readFortuneFromFile(){
        try {
            //hard-coding the file path here for simplicity
            String dailyFortune = Files.readString(Path.of("/Users/23343/Gaurav/PersonalProjects/learning-spring/src/main/resources/Predictions.txt"));
            return dailyFortune.split("\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getFortune() {
        String[] fortuneList = readFortuneFromFile();
        return fortuneList[rand.nextInt(fortuneList.length)];
    }
}
