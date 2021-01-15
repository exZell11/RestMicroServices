package com.example.dndpartynames;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DndpartynamesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DndpartynamesApplication.class, args);
    }

}
