package com.example.servicecaller1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example.servicecaller1" })
@EnableEurekaClient
public class ServiceCaller1Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCaller1Application.class, args);
    }

}

