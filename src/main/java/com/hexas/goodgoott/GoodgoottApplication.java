package com.hexas.goodgoott;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class GoodgoottApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodgoottApplication.class, args);
    }

}

