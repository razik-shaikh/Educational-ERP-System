package com.erp_system.college_erp.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp_system.college_erp.entity.Course;
import com.erp_system.college_erp.entity.Enrollment;
import com.erp_system.college_erp.entity.Student;
import com.erp_system.college_erp.repository.CourseRepository;
import com.erp_system.college_erp.repository.EnrollmentRepository;
import com.erp_system.college_erp.repository.StudentRepository;
import com.erp_system.college_erp.service.EnrollmentService;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Enrollment enrollStudent(Long studentId, Long courseId) {

        Student student = studentRepository.findById(studentId).orElse(null);
        Course course = courseRepository.findById(courseId).orElse(null);

        if (student != null && course != null) {
            Enrollment enrollment = new Enrollment(student, course, LocalDate.now());
            return enrollmentRepository.save(enrollment);
        }
        return null;
    }

    @Override
    public List<Enrollment> getAllEnrollments() {
        // TODO Auto-generated method stub
        return enrollmentRepository.findAll();
    }

    @Override
    public Enrollment getEnrollmentById(Long id) {
        // TODO Auto-generated method stub

        return enrollmentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteEnrollment(Long id) {
        // TODO Auto-generated method stub
        enrollmentRepository.deleteById(id);
    }
}
