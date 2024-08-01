package com.spring.core.springRef;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;

public class VideoDetails implements DisposableBean, InitializingBean {
    String videoTitle;
    String videoViews;

    ChannelDetails cd;
    List<String> comments;

    public VideoDetails(String videoTitle, String videoViews, ChannelDetails cd) {
        this.videoTitle = videoTitle;
        this.videoViews = videoViews;
        this.cd = cd;
    }

    public VideoDetails(){}

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public String getVideoViews() {
        return videoViews;
    }

    public void setVideoViews(String videoViews) {
        this.videoViews = videoViews;
    }

    public ChannelDetails getCd() {
        return cd;
    }

    public void setCd(ChannelDetails cd) {
        this.cd = cd;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "VideoDetails{" +
                "videoTitle='" + videoTitle + '\'' +
                ", videoViews='" + videoViews + '\'' +
                ", cd=" + cd +
                ", comments=" + comments +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bye destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Just created");
    }
}
