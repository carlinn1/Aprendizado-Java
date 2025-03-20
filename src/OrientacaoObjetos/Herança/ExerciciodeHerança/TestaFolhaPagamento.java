package OrientacaoObjetos.Herança.ExerciciodeHerança;

public class TestaFolhaPagamento {
    public static void main(String[] args) {
        Gerente gerente = new Gerente(1, "Carlos Henrique");
        System.out.println(gerente.imprimirFolhaPagamento());

        Telefonista telefonista = new Telefonista(2, "Eduardo Souza");
        System.out.println(telefonista.imprimirFolhaPagamento());

        Vendedor vendedor = new Vendedor(3, "Edna Regina");
        System.out.println(vendedor.imprimirFolhaPagamento());
    }
}
