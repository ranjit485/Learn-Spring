package com.spring.core.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        ApplicationContext context;
        context =new ClassPathXmlApplicationContext("config/collectionConfig.xml");

         StudentModal s1 = (StudentModal) context.getBean("student1");
         System.out.println(s1.getAddress());
         System.out.println(s1.getDatabase());
        Properties p = s1.getDatabase();
        System.out.println(p.get("username"));

    }
}
