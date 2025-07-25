package com.erp_system.college_erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp_system.college_erp.entity.Student;
import com.erp_system.college_erp.repository.StudentRepository;
import com.erp_system.college_erp.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
   @Autowired
    private StudentRepository studentRepo;
   
    // Constructor injection for StudentRepository
    // This is a good practice for better testability and maintainability
    // public StudentServiceImpl(StudentRepository studentRepo) {
    //     this.studentRepo = studentRepo;
    // }

    @Override
    public Student addStudent(Student student) {
        // TODO Auto-generated method stub
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getAllStudents() {

        return studentRepo.findAll();
    }

    @Override
    public Student getStudentById(Long id) {

        return studentRepo.findById(id).orElse(null);
    }

    @Override
    public Student updateStudent(Long id, Student studentDetails) {

        Student student = studentRepo.findById(id).orElse(null);
        if (student != null) {
            student.setName(studentDetails.getName());
            student.setEmail(studentDetails.getEmail());
            student.setDepartment(studentDetails.getDepartment());
            student.setCourse(studentDetails.getCourse());
            return studentRepo.save(student);
        }
        return null;
    }

    @Override
    public String deleteStudent(Long id) {
        studentRepo.deleteById(id);
        return "student deleted";
    }
}
