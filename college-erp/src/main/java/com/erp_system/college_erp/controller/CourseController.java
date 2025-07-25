package com.erp_system.college_erp.controller;

import java.util.List;

import org.hibernate.sql.Delete;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.erp_system.college_erp.entity.Course;
import com.erp_system.college_erp.service.CourseService;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;
    // Define endpoints for course operations here

    @GetMapping("/all-courses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    // Get course by ID
    @GetMapping("/course/{id}")
    public Course getCourseById(@PathVariable Long id) {
        return courseService.getCourseById(id);
    }

    // Add a new course
    @PostMapping("/add-course")
    public Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    // Update a course
    @PutMapping("/update-course/{id}")
    public Course updateCourse(@PathVariable Long id, @RequestBody Course course) {
        return courseService.updateCourse(id, course);
    }

    // Delete a course
    @DeleteMapping("/delete-course/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
    }
}
