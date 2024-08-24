package com.jose.students.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping({"/students", "/"})
    public String listStudents(Model model) {
        return "students";
    }

}
