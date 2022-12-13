package com.personal.gaurav.learningspring.sample.enterpriseapp.web;

import com.personal.gaurav.learningspring.sample.enterpriseapp.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Special annotation for denoting class as a REST endpoint. No need to specify @Component separately
public class Controller {

    @Autowired
    private BusinessService businessService;
    @GetMapping("/bonus") //Annotation for URL pattern. When the URL is invoked, this method is run
    public int displayBonus(){
        return businessService.calculateBonus();
    }
}
