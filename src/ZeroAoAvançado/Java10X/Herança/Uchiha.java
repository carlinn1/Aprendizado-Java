package ZeroAoAvançado.Java10X.Herança;

import ZeroAoAvançado.Java10X.Enums.NivelNinja;

public class Uchiha extends Ninja{


    public void sharinganAtivado() {
        System.out.println("Meu nome é " + nome + " Sharigan Ativado");
    }

    public Uchiha(String nome, String aldeia, int idade, NivelNinja rank) {
        super(nome, aldeia, idade, rank);
    }

    public Uchiha() {
    }
}
