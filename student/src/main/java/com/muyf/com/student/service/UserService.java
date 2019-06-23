package com.muyf.com.student.service;

import com.muyf.com.student.dao.Student;
import com.muyf.com.student.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public List<Student> readStudent(){
        return userMapper.selectAllStudent();
    }
}
