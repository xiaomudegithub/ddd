package com.muyf.com.student.service;

import com.muyf.com.student.dao.Course;
import com.muyf.com.student.mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseMapper courseMapper;

    public List<Course> readAllCourse(){
        return courseMapper.selectAllCourse();
    }

    public Course readCourseByCourseId(int courseId){
        return courseMapper.selectCourseById(courseId);
    }

    public boolean addCourse(Course course){
        return courseMapper.insertCourse(course) >0;
    }
}
