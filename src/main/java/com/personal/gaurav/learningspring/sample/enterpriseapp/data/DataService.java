package com.personal.gaurav.learningspring.sample.enterpriseapp.data;

import org.springframework.stereotype.Component;

@Component
public class DataService {

    public int fetchBasePay(){
        return 120; //Returning hard-coded value. In a real-world enterprise app, this would come from a DB
    }

    public int fetchPerformanceGrade(){
        return 2; //Returning hard-coded value. In a real-world enterprise app, this would come from a DB
    }
}
