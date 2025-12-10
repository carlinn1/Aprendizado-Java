package ZeroAoAvançado.StreamAPI;

import java.util.List;

public class Main {
    public static void main(String[] args) {
       // Records pessoa = new Records("João", "Silva", 30);
       // System.out.println("Nome: " + pessoa.nome());
       // System.out.println("Sobrenome: " + pessoa.sobrenome());
       // System.out.println("Idade: " + pessoa.idade());

        // StreamAPI
        List<Records> pessoas = List.of(
            new Records("João", "Silva", 30),
            new Records("Maria", "Santos", 25),
            new Records("Pedro", "Oliveira", 40)
        );

        pessoas.stream()
            .filter(p -> p.idade() >= 30)
            .map(p -> p.nome() + " " + p.sobrenome())
            .forEach(System.out::println);
    }
}
