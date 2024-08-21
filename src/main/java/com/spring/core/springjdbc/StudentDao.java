package com.spring.core.springjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int saveStudent(Student e){
        String query="insert into students values( '"+e.getStudentId()+"','"+e.getStudenttName()+"','"+e.getAddress().getCity()+"')";
        return jdbcTemplate.update(query);
    }

}
