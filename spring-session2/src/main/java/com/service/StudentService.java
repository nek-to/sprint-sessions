package com.service;

import com.annotations.Sorter;
import com.dao.StudentDAO;
import com.student.Student;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class StudentService implements BeanNameAware, BeanFactoryAware, BeanClassLoaderAware, InitializingBean {
    @Sorter
    private List<Integer> mark = Arrays.asList(1,5,4,2,3);
    @Autowired
    private StudentDAO studentDAO;
    @Autowired
    ApplicationContext applicationContext;

    public List<Student> getList() {
        return studentDAO.getStudentsList();
    }

    public StudentService() {
        System.out.println("Default");
//        this.studentDAO.getStudentsList();
    }

    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public List<Integer> getMark() {
        return mark;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("---------------");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println(s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory.containsBean("studentDAO"));
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println(classLoader);
    }
}
