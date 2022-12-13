package com.personal.gaurav.learningspring.sample.enterpriseapp.business;

import com.personal.gaurav.learningspring.sample.enterpriseapp.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {

    @Autowired
    private DataService dataService;
    public int calculateBonus(){
        return dataService.fetchBasePay() * dataService.fetchPerformanceGrade()/10;
    }

}
