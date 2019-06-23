package com.muyf.com.student.mapper;

import com.muyf.com.student.dao.Course;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CourseMapper {

    @Insert("insert into course values (${courseName})")
    public int insertCourse(Course course);

    @Select("select * from course where id = ${courseId}")
    public Course selectCourseById(int courseId);

    @Select("select * from course")
    public List<Course> selectAllCourse();
}
