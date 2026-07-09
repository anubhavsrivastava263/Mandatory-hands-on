
package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class HelloWorld {

    public void display() {
        System.out.println("Hello Spring!");
    }
}

public class Exercise1 {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloWorld hello = context.getBean("hello", HelloWorld.class);

        hello.display();
    }
}
