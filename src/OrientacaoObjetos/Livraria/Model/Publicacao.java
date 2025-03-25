package OrientacaoObjetos.Livraria.Model;

public class Publicacao implements Item{

    protected String titulo;
    protected String autor;
    protected Double preco;

    public Publicacao(String titulo, String autor, Double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void mostrarDetalhes(){
            System.out.println("Titulo: " + titulo + "autor: " + autor + "preco: " + preco);
    }
}
