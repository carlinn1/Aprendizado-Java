package BeecrowdExercicios;

import java.util.Scanner;

public class SalarioComBonus1009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome = input.nextLine();
        double salario = input.nextDouble();
        double vendas = input.nextDouble();

        double bonus = vendas * 0.15;
        double total = salario + bonus;
        System.out.printf("TOTAL = R$ %.2f\n", total);

    }
}
