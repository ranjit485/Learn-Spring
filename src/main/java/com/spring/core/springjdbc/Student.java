package com.spring.core.springjdbc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private int studentId;
    private String studenttName;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudenttName(String studenttName) {
        this.studenttName = studenttName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Autowired
    private Address address;

    public Student() {

    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudenttName() {
        return studenttName;
    }

    public Address getAddress() {
        return address;
    }
}
