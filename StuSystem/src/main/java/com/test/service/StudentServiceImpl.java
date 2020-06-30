package com.test.service;

import com.test.dao.StudentMapper;
import com.test.pojo.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService{

    //service调Dao层
    private StudentMapper studentMapper;
    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    public int deleteStudentByID(char id) {
        return studentMapper.deleteStudentByID(id);
    }

    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    public Student queryStudentByID(char id) {
        return studentMapper.queryStudentByID(id);
    }

    public List<Student> queryAllStudent() {
        return studentMapper.queryAllStudent();
    }
}
