package com.example.first.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

// Customizing Auto-configuration
/*@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class) // skips this
@ComponentScan(basePackages = "com.example.myapp")*/

public class MyApp {
    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }
}
