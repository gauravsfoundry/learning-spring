package com.personal.gaurav.learningspring.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContraGame implements GamingConsole{

    public void up(){
        System.out.println("SuperContraUp");
    }

    public void down(){
        System.out.println("SuperContraDown");
    }

    public void left(){
        System.out.println("SuperContraLeft");
    }

    public void right(){
        System.out.println("SuperContraRight");
    }
}