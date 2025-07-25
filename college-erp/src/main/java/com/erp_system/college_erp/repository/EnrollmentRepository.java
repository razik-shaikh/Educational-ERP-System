package com.erp_system.college_erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erp_system.college_erp.entity.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {

}
