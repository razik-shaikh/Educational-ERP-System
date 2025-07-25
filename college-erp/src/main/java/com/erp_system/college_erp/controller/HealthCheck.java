package com.erp_system.college_erp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    
    

    private String name;
    
    private int rollno;

    // public HealthCheck(String name, int rollno) {
    //     this.name = name;
    //     this.rollno = rollno;
    // }

    @GetMapping("/health-check")
    public String healthCheck(){
        return "Ok";
    }
}
