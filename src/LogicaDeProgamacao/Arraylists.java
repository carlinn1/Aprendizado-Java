package LogicaDeProgamacao;

import java.util.ArrayList;

public class Arraylists{
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pablo");
        nomes.add("Eduardo");
        nomes.add("Edna");

//        System.out.println(nomes);

        nomes.remove(0);


        System.out.println(nomes.get(0));
        System.out.println(nomes.get(1));
        System.out.println(nomes.get(2));

//        System.out.println(nomes.get(3));

    }
}
