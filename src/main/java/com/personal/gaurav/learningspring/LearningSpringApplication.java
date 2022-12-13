/*
These are learning projects for Spring. These were created as kind of first steps:
com.personal.gaurav.learningspring -> YouTube course from in28minutes https://www.youtube.com/watch?v=VdnFTjeAiJo&t=3955s
com.personal.gaurav.springdemo -> Udemy course Spring & Hibernate for Beginners (includes Spring Boot) by Chad Darby

 */

package com.personal.gaurav.learningspring;

import com.personal.gaurav.learningspring.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearningSpringApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(LearningSpringApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.runGame();
	}
}