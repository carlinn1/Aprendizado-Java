package BeecrowdExercicios;

import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Lendo os dados da primeira peça
        int codigo1 = input.nextInt();
        int quantidade1 = input.nextInt();
        double valorUnitario1 = input.nextDouble();

        // Lendo os dados da segunda peça
        int codigo2 = input.nextInt();
        int quantidade2 = input.nextInt();
        double valorUnitario2 = input.nextDouble();

        // Calculando o valor total
        double total = (quantidade1 * valorUnitario1) + (quantidade2 * valorUnitario2);

        // Exibindo o resultado
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}
