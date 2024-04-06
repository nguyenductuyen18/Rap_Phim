package com.codegym.rapphim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RapPhimApplication {

    public static void main(String[] args) {
        SpringApplication.run(RapPhimApplication.class, args);
        System.out.println("http://localhost:8080");
    }

}
