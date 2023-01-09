package com.personal.gaurav.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;


public class MyApp {
    public static void main(String[] args) {
        
        //create application context which is an abstraction for container 
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        //retrieve a bean from the Spring container
        /*second parameter (interface name) is optional. When we pass the interface to the method, behind the scenes Spring will cast the object.
        However, there are some slight differences than normal casting. From the Spring docs: Behaves the same as getBean(String), but provides
        a measure of type safety by throwing a BeanNotOfRequiredTypeException if the bean is not of the required type. This means that ClassCastException
        can't be thrown on casting the result correctly, as can happen with getBean(String)*/
        Coach theCoach = context.getBean("basketballCoach", Coach.class); //Using default bean name
        
        //call methods on bean
        System.out.println("theCoach.getDailyWorkout() = " + theCoach.getDailyWorkout());
        System.out.println("theCoach.getDailyFortune() = " + theCoach.getDailyFortune());

        //close the context
        context.close();
    }
}





