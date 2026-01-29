package ZeroAoAvançado.Java10X.Herança;

import ZeroAoAvançado.Java10X.Enums.NivelNinja;
import ZeroAoAvançado.Java10X.Interface.InterfaceAnbu;
import ZeroAoAvançado.Java10X.Interface.InterfaceUchiha;

public class Hatake extends Ninja implements InterfaceUchiha, InterfaceAnbu {

    public void euSouHatake(){
        System.out.println(nome + " Faço parte do clã Hatake!");
    }


    public void ativarMangekyou() {
        System.out.println("Sharigan ativado!");
    }

    public void bemVindoAnbu() {
        System.out.println("Sou membro da ANBU!");
    }

    public void ativarSharigan() {
        System.out.println("Mangekyou ativado!");
    }

    public Hatake(String nome, String aldeia, int idade, NivelNinja rank) {
        super(nome, aldeia, idade, rank);
    }

    public Hatake() {
    }
}
