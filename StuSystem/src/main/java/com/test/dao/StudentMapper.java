package com.test.dao;

import com.test.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    // 增加一个学生
    int addStudent(Student student);

    // 通过学号删除一个学生
    int deleteStudentByID(@Param("stuId") char id);

    // 修改一个学生
    int updateStudent(Student student);

    // 通过学号查询学生信息
    Student queryStudentByID(@Param("stuId") char id);

    // 查看全部学生信息
    List<Student> queryAllStudent();

}
