package com.service;

import com.dao.StudentDAO;
import com.student.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentService {

    public StudentService() {
    }

    @Autowired
    StudentDAO studentDAO;
//    StudentDAO studentDAO = new StudentDAO();

    public List<Student> getList() {
        return studentDAO.getStudentsList();
    }

    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }
}
