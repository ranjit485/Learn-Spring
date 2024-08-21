package com.spring.core.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/autowiring.xml");
        Student student = applicationContext.getBean("xu",Student.class);

        System.out.println(student);
    }
}
