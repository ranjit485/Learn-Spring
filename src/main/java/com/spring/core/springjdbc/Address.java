package com.spring.core.springjdbc;

import org.springframework.stereotype.Component;

@Component
public class Address {
    int pinCode;
    String city;

    public Address(int pinCode, String city) {
        this.pinCode = pinCode;
        this.city = city;
    }
    public Address() {}

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
}
