package com.example.first.spring.boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.example.service") // nah thakle kono bean create hobe nah

public class AppConfig {
    // Bean define hoy @component annotation diye.
    /*@Bean
    public MyService myService() {
        return new MyServiceImp();
    }*/
    // configuration details
}
