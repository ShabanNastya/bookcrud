package com.example.bookcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BookcrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookcrudApplication.class, args);
    }

}
