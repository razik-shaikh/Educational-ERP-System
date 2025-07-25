package com.erp_system.college_erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erp_system.college_erp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
