package com.test.controller;

import com.test.pojo.Student;
import com.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/stuSystem")
public class StudentController {
    @Autowired
    @Qualifier("StudentServiceImpl")
    private StudentService studentService;

    @RequestMapping("/allStudent")
    public String list(Model model) {
        List<Student> list = studentService.queryAllStudent();
        model.addAttribute("list", list);
        return "allStudent";
    }
}
