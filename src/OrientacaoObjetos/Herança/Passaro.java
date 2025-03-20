package OrientacaoObjetos.Herança;

public class Passaro extends Animal{
    public static void main(String[] args) {
        Animal passaro = new Animal();

        passaro.setNome("Nome: Bem te Vi");
        passaro.setEspecie("Especie: Aves");
        passaro.setRaça("Raça: Passaro");

        System.out.println(passaro.getNome());
        System.out.println(passaro.getEspecie());
        System.out.println(passaro.getRaça());

    }
}
