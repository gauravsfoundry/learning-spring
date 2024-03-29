package com.personal.gaurav.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;


public class MyApp {
    public static void main(String[] args) {
        
        //create application context which is an abstraction for container 
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        
        //retrieve a bean from the Spring container
        /*second parameter (interface name) is optional. When we pass the interface to the method, behind the scenes Spring will cast the object.
        However, there are some slight differences than normal casting. From the Spring docs: Behaves the same as getBean(String), but provides
        a measure of type safety by throwing a BeanNotOfRequiredTypeException if the bean is not of the required type. This means that ClassCastException
        can't be thrown on casting the result correctly, as can happen with getBean(String)*/
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class); //Using default bean name; casting to class instead of interface because of additional methods in class
        
        //call methods on bean
        System.out.println("theCoach.getDailyWorkout() = " + theCoach.getDailyWorkout());
        System.out.println("theCoach.getDailyFortune() = " + theCoach.getDailyFortune());
        System.out.println("theCoach.getEmailAddress = " + theCoach.getEmailAddress());
        System.out.println("theCoach.getTeamName() = " + theCoach.getTeamName());

        //close the context
        context.close();
    }
}





