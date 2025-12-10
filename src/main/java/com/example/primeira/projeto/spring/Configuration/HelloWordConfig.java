package com.example.primeira.projeto.spring.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.primeira.projeto.spring.Service.HelloWordService;

@Configuration
public class HelloWordConfig {

    @Bean
    public HelloWordService helloWordService() {
        return new HelloWordService();
    }

}
