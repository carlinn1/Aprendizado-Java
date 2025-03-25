package OrientacaoObjetos.Livraria.Model;

public class Livro extends Publicacao {

    private int numeroPaginas;
    public Livro(String titulo, String autor, double preco, int numeroPaginas) {
        super(titulo, autor, preco);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("numeroPaginas: " + numeroPaginas);
    }
}
