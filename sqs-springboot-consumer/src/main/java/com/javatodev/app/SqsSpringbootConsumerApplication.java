package com.javatodev.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SqsSpringbootConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SqsSpringbootConsumerApplication.class, args);
    }

}
