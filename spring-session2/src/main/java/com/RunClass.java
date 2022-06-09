package com;

import com.config.AppConfig;
import com.dao.StudentDAO;
import com.service.StudentService;
import com.student.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class RunClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext classPathXmlApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//        StudentDAO studentDAO = classPathXmlApplicationContext.getBean("studentDAO", StudentDAO.class);
        StudentService studentService = classPathXmlApplicationContext.getBean("studentService", StudentService.class);
        List<Student> list = studentService.getList();
        List<Integer> mark = studentService.getMark();
        System.out.println(mark);
        System.out.println(list);
    }
}
