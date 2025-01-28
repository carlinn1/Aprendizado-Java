package BeecrowdExercicios;

import java.util.Scanner;

public class Salario1008 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horas = input.nextInt();
        double valorHora = input.nextDouble();
        double salario = input.nextDouble();
        double calculo = valorHora * salario;

        System.out.printf("NUMBER = %d\n", horas);
        System.out.printf("SALARY = U$ %.2f\n", calculo);
    }
}
