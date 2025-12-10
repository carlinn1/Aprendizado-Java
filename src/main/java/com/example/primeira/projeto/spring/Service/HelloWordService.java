package com.example.primeira.projeto.spring.Service;

import org.springframework.stereotype.Service;

import com.example.primeira.projeto.spring.Domain.User;

@Service
public class HelloWordService {
    

    public String hello(User user) {
        return "Seu nome: " + user.getName() + "\nSeu email é: " + user.getEmail();
    }
    
}
