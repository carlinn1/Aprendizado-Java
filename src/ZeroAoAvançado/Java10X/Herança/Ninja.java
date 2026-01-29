package ZeroAoAvançado.Java10X.Herança;

import ZeroAoAvançado.Java10X.Enums.NivelNinja;

public abstract class Ninja {

    // Como ela é uma classe abstrata nao pode ser intanciada!
    // Exemplo:  Ninja ninja = new Ninja(); pois ira dar erro!
    String nome;
    String aldeia;
    int idade;
    NivelNinja rank;

    public Ninja(String nome, String aldeia, int idade, NivelNinja rank) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.rank = rank;
    }

    public Ninja() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
