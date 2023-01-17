package com.personal.gaurav.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.personal.gaurav.springdemo") using @Bean annotation instead of @ComponentScan
public class SportConfig {

    @Bean
    public FortuneService randomFortuneService(){//method name is name of the bean created by Spring
        return new RandomFortuneService();
    }

    @Bean
    public Coach swimCoach(){//method name is name of the bean created by Spring
        return new SwimCoach(randomFortuneService());
    }
}
