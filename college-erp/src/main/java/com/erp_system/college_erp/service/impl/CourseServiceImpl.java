package com.erp_system.college_erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp_system.college_erp.entity.Course;
import com.erp_system.college_erp.repository.CourseRepository;
import com.erp_system.college_erp.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepo;
    @Override

    public Course addCourse(Course course) {
        // TODO Auto-generated method stub
        return courseRepo.save(course);
    }

    @Override
    public void deleteCourse(Long id) {
        // TODO Auto-generated method stub
        courseRepo.deleteById(id);
    }

    @Override
    public List<Course> getAllCourses() {
        // TODO Auto-generated method stub
        return courseRepo.findAll();
    }

    @Override
    public Course getCourseById(Long id) {
        // TODO Auto-generated method stub
        return courseRepo.findById(id).orElse(null);
    }

    @Override
    public Course updateCourse(Long id, Course courseDetails) {
        // TODO Auto-generated method stub
        Course course = courseRepo.findById(id).orElse(null);
        if (course != null) {
            course.setName(courseDetails.getName());
            course.setCode(courseDetails.getCode());
            course.setDuration(courseDetails.getDuration());
            return courseRepo.save(course);
        }
        return null;
    }

    
}
