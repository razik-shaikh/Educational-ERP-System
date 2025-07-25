package com.erp_system.college_erp.service;

import java.util.List;

import com.erp_system.college_erp.entity.Course;

public interface CourseService {
    Course addCourse(Course course);
    List<Course> getAllCourses();
    Course getCourseById(Long id);
    Course updateCourse(Long id, Course course);
    void deleteCourse(Long id);
}
