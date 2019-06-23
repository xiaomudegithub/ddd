package com.muyf.com.student.mapper;

import com.muyf.com.student.dao.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from student")
    public List<Student> selectAllStudent() ;

    @Select("select * from student where id = ${studentId}")
    public Student selectCourseById(int studentId);

    @Insert("insert into student values(${name},${age})")
    public int insertStudent(Student student);
}
