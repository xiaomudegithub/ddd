package com.muyf.com.student.dao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class StudentCourse {
      private int id;
      private int studentId;
      private String name;
      private int courseId;
      private String courseName;
}
