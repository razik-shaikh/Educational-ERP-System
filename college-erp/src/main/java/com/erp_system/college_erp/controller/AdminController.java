package com.erp_system.college_erp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.erp_system.college_erp.entity.Admin;
import com.erp_system.college_erp.repository.AdminRepository;

@RestController
public class AdminController {
    @Autowired
    private AdminRepository adminRepository;

    @PostMapping("/admin/register")
    public String register(@RequestBody Admin registerAdmin) {
        adminRepository.save(registerAdmin);
        return "Admin registered successfully!";
    }

    @PostMapping("/admin/login")
    public String login(@RequestBody Admin loginAdmin) {
        Admin admin = adminRepository.findByUsernameAndPassword(loginAdmin.getUsername(), loginAdmin.getPassword());
        if (admin != null) {
            return "Login successful!";
        } else {
            return "Invalid credentials!";
        }
    }
}
