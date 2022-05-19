package com.lyy.coursemanage.utils;

import com.lyy.coursemanage.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class HostHolder {

    private ThreadLocal<Student> students = new ThreadLocal<>();

    public void setStudent(Student user){
        students.set(user);
    }

    public Student getStudent(){
        return students.get();
    }

    public void clear(){
        students.remove();
    }

}
