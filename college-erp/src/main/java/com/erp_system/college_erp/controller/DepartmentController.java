package com.erp_system.college_erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.erp_system.college_erp.entity.Department;
import com.erp_system.college_erp.service.DepartmentService;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentSerice;
    
    @PostMapping("/add-department")
    public Department addDepartment(@RequestBody Department department){
        return departmentSerice.addDepartment(department);
    }

    @GetMapping("all-departments")
    public List<Department> getAllDepartment() {
        return departmentSerice.getAllDepartments();
    }

    @GetMapping("department/{id}")
    public Department getDepartmentById(@PathVariable Long id) {
        return departmentSerice.getDepartmentById(id);
    }

    @PutMapping("update-department/{id}")
    public Department updateDepartment(@PathVariable Long id, @RequestBody Department department) {
        return departmentSerice.updateDepartment(id, department);
    }

    @DeleteMapping("delete-department/{id}")
    public void deleteDepartment(@PathVariable Long id) {
        departmentSerice.deleteDepartment(id);
    }

}
