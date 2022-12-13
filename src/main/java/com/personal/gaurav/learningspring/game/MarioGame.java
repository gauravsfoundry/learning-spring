package com.personal.gaurav.learningspring.game;

import com.personal.gaurav.learningspring.game.GamingConsole;
import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole{

    public void up(){
        System.out.println("MarioUp");
    }

    public void down(){
        System.out.println("MarioDown");
    }

    public void left(){
        System.out.println("MarioLeft");
    }

    public void right(){
        System.out.println("MarioRight");
    }
}