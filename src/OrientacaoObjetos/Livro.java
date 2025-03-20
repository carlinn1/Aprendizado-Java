package OrientacaoObjetos;

public class Livro {

    private String titlulo;
    private String descricaoLivro;
    private String isbn;
    private boolean capaDura;


    public String getTitlulo() {
        return titlulo;
    }

    public void setTitlulo(String titlulo) {
        this.titlulo = titlulo;
    }

    public String getDescricaoLivro() {
        return descricaoLivro;
    }

    public void setDescricaoLivro(String descricaoLivro) {
        this.descricaoLivro = descricaoLivro;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isCapaDura() {
        return capaDura;
    }

    public void setCapaDura(boolean capaDura) {
        this.capaDura = capaDura;
    }

}
