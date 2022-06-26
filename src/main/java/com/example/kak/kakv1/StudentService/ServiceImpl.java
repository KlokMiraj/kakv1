package com.example.kak.kakv1.StudentService;


import com.example.kak.kakv1.Student.Student;
import com.example.kak.kakv1.StudentDAO.DAO;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Collection;

@Named
public class ServiceImpl implements Service{
    @Inject
    private DAO studentDao;

    @Override
    public Student getId(long id) {
        return studentDao.getOne(id);
    }

    @Override
    public Collection<Student> getAllStudent() {
        return studentDao.getAll();
    }
//    private S
}
