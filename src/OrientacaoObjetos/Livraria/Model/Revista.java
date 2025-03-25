package OrientacaoObjetos.Livraria.Model;

public class Revista extends Publicacao{

    private double edicao;

    public Revista(String titulo, String autor, double edicao , double preco) {
        super(titulo, autor, preco);
        this.edicao = edicao;
    }

    @Override
    public void mostrarDetalhes(){
        super.mostrarDetalhes();
        System.out.println("Edição: " + edicao);
    }
}
