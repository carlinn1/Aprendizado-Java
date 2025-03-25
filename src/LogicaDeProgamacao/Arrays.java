package LogicaDeProgamacao;

public class Arrays {
    public static void main(String[] args) {

        // Declarar um ARRAY
        // int []
        // double []
        // float [], byte [], char [], String [] e ETC.

//        int[] numeros = new int[5];
//        numeros[0] = 1;
//        numeros[1] = 2;
//        numeros[2] = 3;
//        numeros[3] = 4;
//        numeros[4] = 5;
//
//       System.out.println(numeros[0]);
//       System.out.println(numeros[1]);
//       System.out.println(numeros[2]);
//       System.out.println(numeros[3]);
//       System.out.println(numeros[4]);

        // Outras maneiras de declarar array

//        int[] idade = {1,2,3,4,5};
//        System.out.println(idade[0]);
//        System.out.println(idade[1]);


        //Array para String
        String [] nome = new String[3];
        nome[0] = "Carlos";
        nome[1] = "Henrique";
        nome[2] = "Souza";

        // Ele inicia em zero posição inicial do array e vai imprimindo.
        // nome.length ele imprime o tamanho do array.
        for (int i = 0; i < nome.length; i++) {
            System.out.println(nome[i]);
        }

    }
}
