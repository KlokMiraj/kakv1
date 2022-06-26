package com.example.kak.kakv1.Controller;

import com.example.kak.kakv1.Student.Student;
import com.example.kak.kakv1.StudentService.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.Collection;
import java.util.List;

@RestController
public class StudentController {

    @Inject
    private Service studentService;

    @GetMapping
    public Collection<Student> getAllStudent(){
        return  studentService.getAllStudent();
    }
}
