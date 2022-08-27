package com.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CustomerApplication {
    public static void main(String[] args) {
        System.setProperty("spring.config.name", "customer-config");
        SpringApplication.run(CustomerApplication.class, args);
    }
}
