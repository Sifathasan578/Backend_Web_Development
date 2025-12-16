package com.example.first.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;

@SpringBootApplication // This ensures the project is treated as spring boot application
/*@Configuration: marks a class as source of bean definitions
@EnableAutoConfiguration
@ComponentScan*/
public class Application {
	public static void main(String[] args) {
		/*
		* boots and starts your entire Spring Boot application — it creates the Spring context, configures everything automatically, and starts the embedded web server (if present).
		* */
		SpringApplication.run(Application.class, args); // very important, bean gula kothay kothay ache, ki ki bean create korte hobe, oigula khuje then run kora

		// singleton
	}
}
