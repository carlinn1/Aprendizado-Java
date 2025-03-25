package OrientacaoObjetos.Livraria.View;

import OrientacaoObjetos.Livraria.Controller.Livraria;
import OrientacaoObjetos.Livraria.Model.Ebook;
import OrientacaoObjetos.Livraria.Model.Livro;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Livraria livraria = new Livraria();
        Scanner sc = new Scanner(System.in);

        int opcao = 9;

        while (opcao != 0) {
            System.out.println("Menu");
            System.out.println("1 - Cadastrar Livraria");
            System.out.println("2 - Cadastrar Ebook");
            System.out.println("3 - Cadastrar Revista");
            System.out.println("4 - Listar Livraria");
            System.out.println("5 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:{
                    System.out.println("Digite o Titulo: ");
                    String titulo = sc.nextLine();
                    System.out.println("Digite o Autor: ");
                    String autor = sc.nextLine();
                    System.out.println("Digite o Preco: ");
                    double preco = sc.nextDouble();
                    System.out.println("Digite as Paginas: ");
                    int paginas = sc.nextInt();

                    Livro livro = new Livro(titulo, autor, preco, paginas);
                    livraria.addItem(livro);

                    break;
            }
                case 2:{
                    System.out.println("Digite o Titulo: ");
                    String titulo = sc.nextLine();
                    System.out.println("Digite o Autor: ");
                    String autor = sc.nextLine();
                    System.out.println("Digite o Preco: ");
                    double preco = sc.nextDouble();
                    System.out.println("Digite as Paginas: ");
                    int paginas = sc.nextInt();
                    double tamanhoArquivo = sc.nextDouble();
                    sc.nextLine();

                    Ebook ebook = new Ebook(titulo, autor, preco, tamanhoArquivo);
                    livraria.addItem(ebook);


                    break;
            }
                case 3:{
                    break;
            }
                case 4:{
                    livraria.listItems();

                    break;
            }
                case 5:{
                    System.exit(0);
            }
            default:
                throw new IllegalArgumentException("Unexpected value: " + opcao);
            }
        }
    }
}
