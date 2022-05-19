package com.lyy.coursemanage.mapper;

import com.lyy.coursemanage.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface StudentMapper {

    Student selectById(@Param("id") int id);

    List<Student> selectStudentBySid(@Param("sid") int sid);

    int updateHours(Student student);

    int insertStudent(Student student);

    List<Student> findAllStudent();

    int update(Student student);

    int delete(@Param("id") Integer id);

    /**
     * 更新头像
     * @param studentId
     * @param headurl
     * @return
     */
    int updateHeadUrl(@Param("id") int studentId, @Param("headurl") String headurl);

}
