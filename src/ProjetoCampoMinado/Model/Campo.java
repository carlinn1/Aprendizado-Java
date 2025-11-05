package ProjetoCampoMinado.Model;

import ProjetoCampoMinado.Controller.Explosao;

import java.util.ArrayList;
import java.util.List;

public class Campo {

    private boolean minado = false;
    private boolean aberto = false;
    private boolean marcado = false;

    private List<Campo> vizinhos = new ArrayList<>();

    private int coluna;
    private int linha;


    Campo(int coluna, int linha) {

        this.coluna = coluna;
        this.linha = linha;
    }

    public Campo() {

    }

    boolean adicionarVizinho(Campo vizinho) {

        boolean linhaDiferente = linha != vizinho.linha;
        boolean colunaDiferente = coluna != vizinho.coluna;
        boolean diagonal = linhaDiferente && colunaDiferente;

        int deltaLinha = Math.abs(linha - vizinho.linha);
        int deltaColuna = Math.abs(coluna - vizinho.coluna);
        int deltaGeral = deltaColuna + deltaLinha;



        if (deltaGeral ==1 && !diagonal) { vizinhos.add(vizinho); return true;}
        else if (deltaGeral == 2 && diagonal) { vizinhos.add(vizinho); return true;}
        else {return false;}

    }

    void alternaMarcaçao(){
        if (!aberto) {
            marcado = !marcado;
        }
    }

    boolean abrir(){
        if (!aberto && !marcado){
            aberto = true;

            if (minado){
                throw new Explosao();
            }
            if (vizinhançaSegura()){
                vizinhos.forEach(v -> v.abrir());
            }
            return true;
        }else {
            return false;
        }
    }

    boolean objetivoAlcançado() {
        boolean desvendado = !minado && aberto;
        boolean protegido = minado && marcado;
        return  desvendado || protegido;
    }

    long minasNaVizinhanca() {
        return vizinhos.stream().filter(v -> v.minado).count();
    }

    void reiniciar() {
        aberto = false;
        minado = false;
        marcado = false;
    }

    public String toString() {
        if (marcado) {
            return "x";
        } else if (aberto && minado) {
            return "*";
        } else if (aberto && minasNaVizinhanca() > 0) {
            return Long.toString(minasNaVizinhanca());
        } else if (aberto) {
            return " ";
        } else {
            return "?";
        }
    }

    boolean vizinhançaSegura() {
        return vizinhos.stream().noneMatch(v -> v.minado);
    }


    public boolean ismarcado () {
        return marcado;
    }

    public boolean isAberto() {
        return aberto;
    }

    public boolean isFechado() {
        return !isAberto();
    }

    public boolean isMinado() {
        return minado;
    }

    public void setMinado(boolean minado) {
        this.minado = minado;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public boolean isMarcado() {
        return marcado;
    }

    public void setMarcado(boolean marcado) {
        this.marcado = marcado;
    }

    public List<Campo> getVizinhos() {
        return vizinhos;
    }

    public void setVizinhos(List<Campo> vizinhos) {
        this.vizinhos = vizinhos;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    void minar() {
        minado = true;

    }
}
