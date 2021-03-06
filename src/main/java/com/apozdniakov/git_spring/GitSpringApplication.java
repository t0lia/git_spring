package com.apozdniakov.git_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
public class GitSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitSpringApplication.class, args);
    }

}
