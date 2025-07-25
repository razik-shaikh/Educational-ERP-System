package com.erp_system.college_erp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.erp_system.college_erp.entity.Enrollment;

@Service
public interface EnrollmentService {
    Enrollment enrollStudent(Long studentId, Long courseId);

    List<Enrollment> getAllEnrollments();

    Enrollment getEnrollmentById(Long id);

    void deleteEnrollment(Long id);
}
