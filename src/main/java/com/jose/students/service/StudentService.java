package com.jose.students.service;

import com.jose.students.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    public List<Student> listAllStudents();
    public Student saveStudent(Student student);
    public Student getStudentById(Long id);
    public Student updateStudent(Student student);
    public void deleteStudent(Long id);

}
