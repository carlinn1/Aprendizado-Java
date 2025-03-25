package OrientacaoObjetos.Livraria.Model;

public class Ebook extends Publicacao{

    private double tamanhoArquivo;

    public Ebook(String titulo, String autor, double preco, double tamanhoArquivo){
        super(titulo, autor, preco);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public void mostrarDetalhes(){
        super.mostrarDetalhes();
        System.out.println("Tamanho Arquivo: " + tamanhoArquivo);
    }
}
