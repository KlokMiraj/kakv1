package com.example.kak.kakv1.StudentDAO;

import com.example.kak.kakv1.Student.Student;

import java.util.Collection;

public interface DAO {
    Student getOne(long id);
    Collection<Student> getAll();

}
