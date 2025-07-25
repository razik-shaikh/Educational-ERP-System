package com.erp_system.college_erp.service;

import com.erp_system.college_erp.entity.Student;
import java.util.List;

// import org.springframework.stereotype.Service;

// @Service
public interface StudentService {
    
    Student addStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(Long id);

    Student updateStudent(Long id, Student student);

    String deleteStudent(Long id);
}
