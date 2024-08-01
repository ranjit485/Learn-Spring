package com.spring.core.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class StudentModal {
    String name;
    List<String> numbers;
    Set<String> address;
    Map<String,String> courses;
    Properties database;

    // No-arg constructor
    StudentModal(){}

    public StudentModal(String name, List<String> numbers, Set<String> address, Map<String, String> courses, Properties database) {
        this.name = name;
        this.numbers = numbers;
        this.address = address;
        this.courses = courses;
        this.database = database;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Properties getDatabase() {
        return database;
    }

    public void setDatabase(Properties database) {
        this.database = database;
    }
}
