package ProjetoCampoMinado.View;

import ProjetoCampoMinado.Controller.Explosao;
import ProjetoCampoMinado.Controller.Sair;
import ProjetoCampoMinado.Model.Tabuleiro;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class TabuleiroConsole {

    private Tabuleiro tabuleiro;
    Scanner scanner = new Scanner(System.in);

    public TabuleiroConsole(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        
        executarJogo();
    }



    private void executarJogo() {
        try {

            boolean continuar = true;

            while (continuar){
                cicloDoJogo();

                System.out.println("Outra partida? (S/n): ");
                String resposta = scanner.nextLine();

                if ("n".equalsIgnoreCase(resposta)){
                    continuar = false;
                } else {
                    tabuleiro.reiniciar();
                }
            }

        }catch (Sair e){
            System.out.println("Tchau!!");
        } finally {
            scanner.close();
        }
    }

    private void cicloDoJogo() {
        try{
            while (!tabuleiro.objetivoAlcançado() ){
                System.out.println(tabuleiro);

                String digitado = capturarValorDigitado("Digite X, Y: ");
                Iterator<Integer> xy = Arrays.stream(digitado.split(",")).map(e -> Integer.parseInt(e.trim())).iterator();
                digitado = capturarValorDigitado("1 - abrir ou 2 - (desmarcar)");
                
                if ("1".equals(digitado)){
                    tabuleiro.abrir(xy.next(), xy.next());
                } else if ("2".equals(digitado)) {
                    tabuleiro.alternaMarcaçao(xy.next(), xy.next());
                    
                }
            }

            System.out.println(" Voce ganhou!!");
        } catch (Explosao e){
            System.out.println(tabuleiro);
            System.out.println("Voce perdeu!");
        }
    }

    private String capturarValorDigitado(String texto){
        System.out.println(texto);
        String digitado = scanner.nextLine();

        if ("Sair".equalsIgnoreCase(digitado)){
            throw new Sair();
        }
        return digitado;
    }
}
