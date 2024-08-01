package com.spring.core.springRef;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/sRef.xml");
        VideoDetails videoDetails = (VideoDetails) context.getBean("videoDetails");

        System.out.println(videoDetails.getVideoTitle());
        System.out.println(videoDetails.getComments().get(0));
        System.out.println(videoDetails.getCd().getChannelName());


    }
}
