package com.spring.core.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Value("41537")
    int pin;
    @Value("Sangli")
    String city;

    public Address(int pin, String city) {
        this.pin = pin;
        this.city = city;
    }
   public Address(){}

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "pin=" + pin +
                ", city='" + city + '\'' +
                '}';
    }
}
