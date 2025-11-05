package ProjetoCampoMinado.Model;

import ProjetoCampoMinado.Controller.Explosao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Tabuleiro {

    private int linhas;
    private  int colunas;
    private  int minas;
    private final List<Campo> campos = new ArrayList<>();

    public Tabuleiro(int linhas, int colunas, int minas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.minas = minas;

        gerarCampos();
        associarOsVizinhos();
        sortearMinas();
    }

    public void abrir(int linhas, int colunas) {

        try {
            campos.parallelStream()
                    .filter(c -> c.getLinha() == linhas && c.getColuna() == colunas)
                    .findFirst()
                    .ifPresent(c -> c.abrir());

        } catch (Explosao e) {
            campos.forEach(c -> c.setAberto(true));
            throw e;
        }
    }

    public void alternaMarcaçao(int linhas, int colunas) {
        campos.parallelStream()
                .filter(c -> c.getLinha() == linhas && c.getColuna() == colunas)
                .findFirst()
                .ifPresent(c -> c.alternaMarcaçao());
    }

    private void sortearMinas() {
        long minasArmadas = 0;
        Predicate<Campo> minado = c -> c.isMinado();

        do {
            int aleatorio = (int) (Math.random() * campos.size());
            campos.get(aleatorio).minar();
            minasArmadas = campos.stream().filter(minado).count();
        } while (minasArmadas < minas);
    }

    private void associarOsVizinhos() {
        for (Campo c1: campos){
            for (Campo c2: campos){
                c1.adicionarVizinho(c2);
            }
        }
    }

    private void gerarCampos() {
        for (int i =0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                campos.add(new Campo(i, j));
            }
        }
    }

    public boolean objetivoAlcançado() {
        return campos.stream().allMatch(c -> c.objetivoAlcançado());
    }

    public void reiniciar() {
        campos.stream().forEach(c -> c.reiniciar());
        sortearMinas();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        int i = 0;
        for (int l = 0; l < linhas; l++){
            for (int c = 0; c < colunas; c++){
                sb.append(" ");
                sb.append(campos.get(i));
                sb.append(" ");
                i++;
            }
            sb.append("\n");
        }
        return sb.toString();
    }


}
