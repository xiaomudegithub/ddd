package com.muyf.com.student.controller;

import com.muyf.com.student.dao.Student;
import com.muyf.com.student.dao.StudentCourse;
import com.muyf.com.student.service.CourseService;
import com.muyf.com.student.service.StudentCourseService;
import com.muyf.com.student.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    StudentCourseService studentCourseService;
    @Autowired
    CourseService courseService;

    @RequestMapping("/students")
    @ResponseBody
    public List<Student> getStudents(){
        return userService.readStudent();
    }

    @RequestMapping("/choseCourse")
    @ResponseBody
    public boolean choseCourse(@RequestBody StudentCourse studentCourse){
        return studentCourseService.addStudentCourse(studentCourse);
    }

    @RequestMapping("/checkUserCourseByStuId")
    @ResponseBody
    public List<StudentCourse> checkUserCourseByStuId(int userId){
        return studentCourseService.readStudentCoursesByStudentId(userId);
    }


    @RequestMapping("/checkUserCourseByCourseId")
    @ResponseBody
    public List<StudentCourse> checkUserCourseByCourseId(int courseId){
        return studentCourseService.readStudentCoursesByCourseId(courseId);
    }
}
