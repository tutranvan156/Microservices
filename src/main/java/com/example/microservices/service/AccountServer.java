package com.example.microservices.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableAutoConfiguration
@EnableDiscoveryClient
public class AccountServer {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "account-server");
        SpringApplication.run(AccountServer.class, args);
    }
}
