package com.erp_system.college_erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp_system.college_erp.entity.Faculty;
import com.erp_system.college_erp.repository.FacultyRepository;
import com.erp_system.college_erp.service.FacultyService;

@Service
public class FacultyServiceImpl implements FacultyService {

    @Autowired
    private FacultyRepository facultyRepo;

    @Override
    public Faculty addFaculty(Faculty faculty) {
        // TODO Auto-generated method stub
        return facultyRepo.save(faculty);
    }

    @Override
    public void deleteFaculty(Long id) {
        // TODO Auto-generated method stub
        facultyRepo.deleteById(id);
    }

    @Override
    public List<Faculty> getAllFaculties() {
        // TODO Auto-generated method stub
        return facultyRepo.findAll();
    }

    @Override
    public Faculty getFacultyById(Long id) {
        // TODO Auto-generated method stub
        return facultyRepo.findById(id).orElse(null);
    }

    @Override
    public Faculty updateFaculty(Long id, Faculty facultyDetails) {
        // TODO Auto-generated method stub
        Faculty faculty = facultyRepo.findById(id).orElse(null);
        if (faculty != null) {
            faculty.setName(facultyDetails.getName());
            faculty.setEmail(facultyDetails.getEmail());
            faculty.setDepartment(facultyDetails.getDepartment());
            faculty.setSubject(facultyDetails.getSubject());
            return facultyRepo.save(faculty);
        }

        return null;
    }

}
