package com.example.primeira.projeto.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.primeira.projeto.spring.Domain.User;
import com.example.primeira.projeto.spring.Service.HelloWordService;

@RestController
@RequestMapping("/api")
public class HelloWordController {

    // aprendendo injeção de dependência
    // Autowired cria uma instância automática do HelloWordService
    // assim não precisamos criar um new HelloWordService()
    // GetMapping mapeia requisições do tipo GET
    // PostMapping mapeia requisições do tipo POST
    // PathVariable mapeia variáveis vindas na URL
    // RequestParam mapeia parâmetros vindos na URL Como ?parametro=valor server para filtros
    // RequestBody mapeia o corpo da requisição

    // Json deve retornar no corpo da requisição
    // Exemplo de JSON:
    /*
    {
        "name": "Carlos",
        "email": "carlos@example.com"
    }
    */

    //Retorna o nome e email do usuário enviado no corpo da requisição

    /*
    {
        Seu nome: Carlos
        Seu email é: carlocarlo960@gmail.com
        ID recebido: 01
        Filter: Carlos
    }
    */


    @Autowired
    private HelloWordService helloWordService;

    @GetMapping()
    public String hello() {
        return "Hello, World!";

    }

     @PostMapping("/{id}")
    public String helloPost(@PathVariable("id") String id, @RequestParam(value = "filter", required = false) String filter, @RequestBody User user) {
        return helloWordService.hello(user) + "\nID recebido: " + id + "\nFilter: " + filter;
    }

}
