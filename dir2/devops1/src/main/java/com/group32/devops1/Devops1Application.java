package com.group32.devops1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Devops1Application {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("I am in feature branch");
        SpringApplication.run(Devops1Application.class, args);
    }
}
