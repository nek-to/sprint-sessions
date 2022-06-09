package com.service;

import com.dao.StudentDAO;
import com.student.Student;

import java.util.List;

public class StudentService {
    StudentDAO studentDAO = new StudentDAO();

    public List<Student> getList(){
        return studentDAO.getStudentsList();
    }
}
