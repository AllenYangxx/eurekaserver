package com.example.serviceprovider1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = { "com.example.serviceprovider1.controller" })
public class ServiceProvider1Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProvider1Application.class, args);
    }

}

