package com.spring.core.annotationwithconfigclass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.core.annotationwithconfigclass")
public class BeanConfig {
    @Bean
    public Student getStudent(){
        Student student = new Student();
        student.setName("Ranjit");
        student.setRollNo(22);
        return student;
    }
    @Bean
    public Address getAddress(){
        return new Address();
    }
}
