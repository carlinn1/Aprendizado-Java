package LogicaDeProgamacao;

import java.util.Scanner;

public class EntradaSaidaDeDados {
    public static void main(String[] args) {

        // Usamos para saida System.out.print(); Imprime sem pular linha
        // Usamos para saida System.out.println(); Imprime e pula linha
        // Usamos para saida System.out.printf(); Imprime formatado

        /*
                Usamos o Scanner para entrada de dados onde o usuario
                coloca a entrada que ele deseja!
        */

        //      System.out.println("Imprime e pula linha");
        //      System.out.print("Imprime sem pular linha // ");
        //      System.out.printf("Imprime formatado");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");

        int numero = scanner.nextInt();
        System.out.println("Numero digitado: " + numero);



    }
}
