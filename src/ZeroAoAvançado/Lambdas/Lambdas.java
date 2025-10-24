package ZeroAoAvançado.Lambdas;

import java.util.Arrays;
import java.util.List;

public class Lambdas {


    // Lambda é uma função anônima que pode ser tratada como um objeto de primeira classe.
    // Ela pode ser passada como argumento para outros métodos, retornada como valor de um método, e atribuída a variáveis.
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "Bia", "Carlos", "Daniel");

        // Exemplo de expressão lambda
        nomes.forEach(nome -> System.out.println("Olá, " + nome + "!"));

        LambdasInterface.Calculadora calc = (x, y) -> { return x + y; };
        System.out.println("Soma: " + calc.calcular(5, 10));

        LambdasInterface.Calculadora subtracao = (x, y) -> x - y;
        System.out.println("Subtração: " + subtracao.calcular(10, 5));

        LambdasInterface.Calculadora multiplicacao = (x, y) -> x * y;
        System.out.println("Multiplicação: " + multiplicacao.calcular(5, 10));

        LambdasInterface.Calculadora divisao = (x, y) -> x / y;
        System.out.println("Divisão: " + divisao.calcular(10, 2));
    }

}
