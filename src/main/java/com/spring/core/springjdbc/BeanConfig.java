package com.spring.core.springjdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.spring.core.springjdbc")
public class BeanConfig {

    @Bean
    public Student student(){
        return new Student();
    }

    @Bean
    public Address getAddress(){
        return new Address();
    }

    @Bean
    public JdbcTemplate getJdbcTemplate(){
         return  new JdbcTemplate(driverManagerDataSource());
    }

    @Bean
    public DriverManagerDataSource driverManagerDataSource(){
        return new DriverManagerDataSource("jdbc:mysql://localhost:3306/student","root","");
    }

}
