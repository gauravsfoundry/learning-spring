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
        Coach firstCoach = context.getBean("myCoach", Coach.class);
        Coach secondCoach = context.getBean("myCoach", Coach.class);
        boolean sameBean = (firstCoach == secondCoach);

        //No special scope defined in applicationContext.xml so default scope of singleton applies and only one instance of bean is created
        System.out.println("Singleton Test: Is it same bean = " + sameBean);
        System.out.println("firstCoach resides@ = " + firstCoach);
        System.out.println("secondCoach resides@ = " + secondCoach);

        //close the context
        context.close();
    }
}





