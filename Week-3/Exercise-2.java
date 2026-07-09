package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Country {

    private String code;
    private String name;

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(code + " " + name);
    }
}

public class Exercise2 {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Country c = context.getBean(Country.class);

        c.display();
    }
}
