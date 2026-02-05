package ZeroAoAvançado.Java10X.Variados;

import java.util.LinkedList;
import java.util.Queue;

public class Filas {

    public static void main(String[] args) {

        Queue<String> ninjasFilas = new LinkedList<>();

        ninjasFilas.add("Paulo");
        ninjasFilas.add("Carlos");
        ninjasFilas.add("Henrique");
        ninjasFilas.add("Layon");

        System.out.println(ninjasFilas);

        ninjasFilas.remove();
        System.out.println(ninjasFilas);
    }
}
