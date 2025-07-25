package com.erp_system.college_erp.service;

import java.util.List;

import com.erp_system.college_erp.entity.Faculty;

public interface FacultyService {
    Faculty addFaculty(Faculty faculty);
    List<Faculty> getAllFaculties();
    Faculty getFacultyById(Long id);
    Faculty updateFaculty(Long id, Faculty faculty);
    void deleteFaculty(Long id);


}
