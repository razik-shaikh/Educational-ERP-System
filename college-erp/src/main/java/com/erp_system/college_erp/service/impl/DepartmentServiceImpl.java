package com.erp_system.college_erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp_system.college_erp.entity.Department;
import com.erp_system.college_erp.repository.DepartmentRepository;
import com.erp_system.college_erp.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepo;

    @Override
    public Department addDepartment(Department department) {
        // TODO Auto-generated method stub
        return departmentRepo.save(department);
    }

    @Override
    public List<Department> getAllDepartments() {
        // TODO Auto-generated method stub
        return departmentRepo.findAll();
    }

    @Override
    public Department getDepartmentById(Long id) {
        // TODO Auto-generated method stub
        return departmentRepo.findById(id).orElse(null);
    }

    @Override
    public Department updateDepartment(Long id, Department department) {
        // TODO Auto-generated method stub
        Department existingDepartment = departmentRepo.findById(id).orElse(null);
        if (existingDepartment != null) {
            existingDepartment.setName(department.getName());
            existingDepartment.setHeadOfDepartment(department.getHeadOfDepartment());
            return departmentRepo.save(existingDepartment);
        }

        return null;
    }

    @Override
    public void deleteDepartment(Long id) {
        // TODO Auto-generated method stub
        departmentRepo.deleteById(id);

    }

}
