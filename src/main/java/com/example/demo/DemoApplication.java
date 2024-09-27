package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    private static DatabaseInitializer databaseInitializer;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        databaseInitializer.initializeDatabase();
    }

}
