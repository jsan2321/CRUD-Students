package com.jose.students.controller;

import com.jose.students.entity.Student;
import com.jose.students.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping({"/students", "/"})
    public String listStudents(Model model) {
        model.addAttribute("students", service.listAllStudents());
        return "students";
    }

    @GetMapping("/students/new")
    public String showStudentRegisterForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";
    }

    @PostMapping("students")
    public String saveStudent(@ModelAttribute("student") Student student) {
        service.saveStudent(student);
        return "redirect:/students";
    }
}
