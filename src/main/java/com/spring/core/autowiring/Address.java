package com.spring.core.autowiring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Value("44")
    int pinCode;
    @Value("sangli")
    String city;
    public Address(){}

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address(int pinCode, String city) {
        this.pinCode = pinCode;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "pinCode=" + pinCode +
                ", city=" + city +
                '}';
    }
}
