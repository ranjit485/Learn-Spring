package com.spring.core.springRef;

public class ChannelDetails {
  String channelName;
  String channelOwner;
  int channelSubscribers;

    public ChannelDetails(String channelName, String channelOwner, int channelSubscribers) {
        this.channelName = channelName;
        this.channelOwner = channelOwner;
        this.channelSubscribers = channelSubscribers;
    }

    public ChannelDetails() {}

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getChannelOwner() {
        return channelOwner;
    }

    public void setChannelOwner(String channelOwner) {
        this.channelOwner = channelOwner;
    }

    public int getChannelSubscribers() {
        return channelSubscribers;
    }

    public void setChannelSubscribers(int channelSubscribers) {
        this.channelSubscribers = channelSubscribers;
    }

    @Override
    public String toString() {
        return "ChannelDetails{" +
                "channelName='" + channelName + '\'' +
                ", channelOwner='" + channelOwner + '\'' +
                ", channelSubscribers=" + channelSubscribers +
                '}';
    }
}
