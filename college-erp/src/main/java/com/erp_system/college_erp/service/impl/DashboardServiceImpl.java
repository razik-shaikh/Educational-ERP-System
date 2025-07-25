package com.erp_system.college_erp.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp_system.college_erp.repository.CourseRepository;
import com.erp_system.college_erp.repository.DepartmentRepository;
import com.erp_system.college_erp.repository.EnrollmentRepository;
import com.erp_system.college_erp.repository.FacultyRepository;
import com.erp_system.college_erp.repository.StudentRepository;
import com.erp_system.college_erp.service.DashboardService;


@Service
public class DashboardServiceImpl implements DashboardService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private FacultyRepository facultyRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    @Override
    public Map<String, Long> getCounts() {
        // TODO Auto-generated method stub

        Map<String ,Long>counts= new HashMap<>();

        counts.put("students",studentRepository.count());
        counts.put("faculty",facultyRepository.count());
        counts.put("departments",departmentRepository.count());
        counts.put("courses",courseRepository.count());
        counts.put("enrollment",enrollmentRepository.count());

        return counts;
    }
    


}
