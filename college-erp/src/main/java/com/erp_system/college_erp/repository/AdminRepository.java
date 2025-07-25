package com.erp_system.college_erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erp_system.college_erp.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByUsernameAndPassword(String username, String password);
}
