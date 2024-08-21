package com.spring.core.springRef;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/sRef.xml");
        VideoDetails videoDetails = (VideoDetails) context.getBean("videoDetails");

        System.out.println(videoDetails.getVideoTitle());
        System.out.println(videoDetails.getComments().get(0));
        System.out.println(videoDetails.getCd().getChannelName());

        Class.forName("com.mysql.cj.jdbc.Driver");

        try {
            Connection conn = DriverManager.getConnection("http://localhost:80:canigo","root","");

        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
