package com.lyy.coursemanage.service;

import com.lyy.coursemanage.entity.Student;
import com.lyy.coursemanage.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public int save(Student student) {
        if(student.getId() != null) {
            return studentMapper.update(student);
        } else {
            return studentMapper.insertStudent(student);
        }

    }

}
