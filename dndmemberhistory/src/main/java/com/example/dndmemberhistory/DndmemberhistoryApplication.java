package com.example.dndmemberhistory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DndmemberhistoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(DndmemberhistoryApplication.class, args);
    }

}
