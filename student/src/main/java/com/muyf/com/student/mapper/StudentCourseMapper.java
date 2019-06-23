package com.muyf.com.student.mapper;

import com.muyf.com.student.dao.StudentCourse;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentCourseMapper {

    @Insert("insert into student_course values (${studentId},${courseId})")
    public int insertStudentCourse(StudentCourse studentCourse);

    @Select("select a.id, a.student_id, b.name, a.course_id, c.course_name from student_course a left join student b on  a.student_id = b.id  left join course c on a.course_id = c.id where a.student_id =${studentId} ")
    public List<StudentCourse>  selectStudentCoursesByStudentId(@Param("studentId") int studentId);

    @Select("select a.id, a.student_id, b.name, a.course_id, c.course_name from student_course a left join student b on  a.student_id = b.id  left join course c on a.course_id = c.id where a.course_id =${courseId}")
    public List<StudentCourse> selectStudentCoursesByCourseId(@Param("courseId") int courseId);

}
