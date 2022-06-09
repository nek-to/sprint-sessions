package com;

import com.dao.StudentDAO;
import com.service.StudentService;
import com.student.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class RunClass {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        StudentDAO studentDAO = classPathXmlApplicationContext.getBean("studentDAO", StudentDAO.class);
        StudentService studentService = classPathXmlApplicationContext.getBean("studentService", StudentService.class);
        List<Student> list = studentService.getList();
        System.out.println(list);
    }
}
