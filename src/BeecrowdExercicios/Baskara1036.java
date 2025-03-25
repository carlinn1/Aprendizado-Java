package BeecrowdExercicios;

import java.util.Scanner;

public class Baskara1036 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();

        double delta = (B * B) - (4 * A * C);

        if (A == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            double R1 = (-B + Math.sqrt(delta)) / (2 * A);
            double R2 = (-B - Math.sqrt(delta)) / (2 * A);

            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        }

        scan.close();
    }
}

