package com.dao;

import com.student.Student;

import java.util.List;

public class StudentDAO {

    public List<Student> getStudentsList() {
        return List.of(new Student(1, "Student 1"), new Student(1, "Student 2"));
    }
}
