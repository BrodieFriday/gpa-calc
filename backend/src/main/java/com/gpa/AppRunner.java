package com.gpa;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppRunner {
    public static void main(String []args) throws IOException {
   
    SpringApplication.run(AppRunner.class, args);

    }
}
