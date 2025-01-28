package LogicaDeProgamacao;

public class Strings {
    public static void main(String[] args) {

        //Strings são sequencias de palavras diferente de CHAR.
        //Isso se chama concatenação de Strings ou seja a junção de palavras!

        String nome = "Carlos";
        String sobrenome = "Henrique";

        int tamanho = nome.length() + sobrenome.length();
        boolean saoIguais = nome.equals(sobrenome);


        System.out.println(nome.toUpperCase() + " " + sobrenome); // Maiusculo
        System.out.println(nome.toLowerCase() + " " + sobrenome); // Minusculo
        System.out.println("Tamanho da String: " + tamanho);
        System.out.println("Sao Iguais? " + saoIguais);

    }
}
