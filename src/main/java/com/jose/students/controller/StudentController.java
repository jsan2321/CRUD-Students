package com.jose.students.controller;

import com.jose.students.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping({"/students", "/"})
    public String listStudents(Model model) {
        return "students";
    }

}
