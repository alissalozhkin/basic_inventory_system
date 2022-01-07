package com.example.webapp_connection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(com.example.webapp_connection.WebappConnectionApplication.class)

@SpringBootApplication
public class WebappConnectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebappConnectionApplication.class, args);
    }

}
