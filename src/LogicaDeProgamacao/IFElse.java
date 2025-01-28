package LogicaDeProgamacao;

public class IFElse {
    public static void main(String[] args) {
        // IF Se
        // Else Se não]

//        int idade = 30;
//
//        if (idade >= 18){
//            System.out.println("Maior de idade!");
//        }else {
//            System.out.println("Menor de idade!");
//
//        }

//        boolean estachovendo = true;
//
//        if (!estachovendo){
//            System.out.println("Vamos ficar em casa!");
//        }else {
//            System.out.println("Vamos sair!");
//        }

        boolean temDinheiro = true;
        boolean temCartao = false;

        if (temDinheiro && temCartao){

            System.out.println("Podemos comprar!");

        } else if (temDinheiro || temCartao) {

            System.out.println("Podemos pagar!");

        }else {

            System.out.println("Nao podemos comprar ou pagar!");

        }
    }
}
