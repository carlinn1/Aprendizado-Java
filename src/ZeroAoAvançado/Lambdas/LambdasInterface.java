package ZeroAoAvançado.Lambdas;

public class LambdasInterface {

    // Interface funcional é uma interface que possui apenas um método abstrato.
    // Ela pode ser implementada por expressões lambda.

    @FunctionalInterface
    interface Calculadora {
        int calcular(int a, int b);
    }

}
