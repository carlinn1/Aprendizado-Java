package OrientacaoObjetos.GetSetter;

public class MainLivro {
    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.setTitlulo("Titulo do Livro: Uma manhã");
        livro.setDescricaoLivro("Descrição: Livro de Romance");
        livro.setIsbn("Numero de Série: 123-456");
        livro.setCapaDura(true);

        System.out.println(livro.getTitlulo());
        System.out.println(livro.getDescricaoLivro());
        System.out.println(livro.getIsbn());
        System.out.println(livro.isCapaDura());

    }
}
