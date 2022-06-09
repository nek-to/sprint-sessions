package com.student;

public class Student {
    private int i;
    private String name;

    public Student(int i, String name) {
        this.i = i;
        this.name = name;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "i=" + i +
                ", name='" + name + '\'' +
                '}';
    }
}
