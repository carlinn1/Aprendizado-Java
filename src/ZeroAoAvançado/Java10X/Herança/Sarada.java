package ZeroAoAvançado.Java10X.Herança;

import ZeroAoAvançado.Java10X.Enums.NivelNinja;
import ZeroAoAvançado.Java10X.Interface.InterfaceUchiha;

public class Sarada extends Uchiha implements InterfaceUchiha {

    public void ativarSharigan() {
        System.out.println("Sharigan ativado!");
    }

    public void ativarMangekyou(){
        System.out.println("Mangekyou ativado!");
    }

    public Sarada(String nome, String aldeia, int idade, NivelNinja rank) {
        super(nome, aldeia, idade, rank);
    }

    public Sarada() {
    }
}
