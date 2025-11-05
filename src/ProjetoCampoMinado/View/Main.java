package ProjetoCampoMinado.View;

import ProjetoCampoMinado.Model.Campo;
import ProjetoCampoMinado.Model.Tabuleiro;

public class Main {
    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(6,6,6);
        new TabuleiroConsole(tabuleiro);



    }
}
