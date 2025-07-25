package com.erp_system.college_erp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp_system.college_erp.service.DashboardService;

// @CrossOrigin(origins = "http://localhost:4200")
@RestController
public class DashboardController {

    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/dashboard-counts")
    public Map<String, Long> getDashboardCounts() {
        return dashboardService.getCounts();
    }
}
