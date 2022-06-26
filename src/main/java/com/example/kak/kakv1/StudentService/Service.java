package com.example.kak.kakv1.StudentService;

import com.example.kak.kakv1.Student.Student;

import java.util.Collection;

public interface Service {
    Student getId(long id);
    Collection<Student> getAllStudent();
}
