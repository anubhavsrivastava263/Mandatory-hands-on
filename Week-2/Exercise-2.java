package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Address {

    private String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}

class Employee {

    private Address address;

    public Employee(Address address) {
        this.address = address;
    }

    public void show() {
        System.out.println(address.getCity());
    }
}

public class Exercise2 {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee emp = context.getBean(Employee.class);

        emp.show();
    }
}
