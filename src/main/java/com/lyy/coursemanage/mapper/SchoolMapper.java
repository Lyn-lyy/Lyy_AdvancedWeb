package com.lyy.coursemanage.mapper;

import com.lyy.coursemanage.entity.School;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface SchoolMapper {

    /**
     * 增
     * @param school
     * @return
     */
    int addSchool(School school);

    /**
     * 删
     * @param id
     * @return
     */
    int deleteSchool(@Param("id") int id);

    /**
     * 改
     * @param school
     * @return
     */
    int updateSchool(School school);

    /**
     * 根据ID查
     * @param id
     * @return
     */
    School findSchoolById(@Param("id") int id);

    /**
     * 查找所有的学院
     * @return
     */
    List<School> findAllSchools();


}
