package com.muyf.com.student.dao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Course {
    private int id;
    private String courseName;
    private int studentId;
}
