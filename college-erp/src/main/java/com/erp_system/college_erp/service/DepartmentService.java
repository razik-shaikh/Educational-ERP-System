package com.erp_system.college_erp.service;

import java.util.List;

import com.erp_system.college_erp.entity.Department;

public interface DepartmentService {

    Department addDepartment(Department department);

    List<Department> getAllDepartments();

    Department getDepartmentById(Long id);

    Department updateDepartment(Long id, Department department);

    void deleteDepartment(Long id);
}
