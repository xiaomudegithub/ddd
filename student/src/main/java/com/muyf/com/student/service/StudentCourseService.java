package com.muyf.com.student.service;

import com.muyf.com.student.dao.StudentCourse;
import com.muyf.com.student.mapper.StudentCourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentCourseService {

    @Autowired
    StudentCourseMapper studentCourseMapper;

    public boolean addStudentCourse(StudentCourse studentCourse){
        return studentCourseMapper.insertStudentCourse(studentCourse) > 0;
    }

    public List<StudentCourse> readStudentCoursesByStudentId(int studentId){
        return studentCourseMapper.selectStudentCoursesByStudentId(studentId);
    }


    public List<StudentCourse> readStudentCoursesByCourseId(int courseId){
        return studentCourseMapper.selectStudentCoursesByCourseId(courseId);
    }

}
