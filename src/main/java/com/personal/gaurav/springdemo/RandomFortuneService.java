package com.personal.gaurav.springdemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] fortuneList;
    Random rand = new Random();

    //Read predictions from a file
    @PostConstruct
    public void readFortuneFromFile(){
        try {
            System.out.println("Inside @PostConstruct method");
            //hard-coding the file path here for simplicity
            String dailyFortune = Files.readString(Path.of("/Users/23343/Gaurav/PersonalProjects/learning-spring/src/main/resources/Predictions.txt"));
            fortuneList = dailyFortune.split("\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @PreDestroy
    public void closeFileAfterReading(){
        System.out.println("Inside @PreDestroy method simulating file close");
        System.out.println("File closed successfully!");
    }

    @Override
    public String getFortune() {
        return fortuneList[rand.nextInt(fortuneList.length)];
    }
}
