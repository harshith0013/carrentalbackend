package com.example.carrental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.carrental")
@EntityScan(basePackages = "com.example.carrental.model")
@EnableJpaRepositories(basePackages = "com.example.carrental.repository")
public class CarRentalApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(CarRentalApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CarRentalApplication.class);
    }
}
