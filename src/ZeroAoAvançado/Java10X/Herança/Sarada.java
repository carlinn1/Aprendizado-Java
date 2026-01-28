package ZeroAoAvançado.Java10X.Herança;

import ZeroAoAvançado.Java10X.Interface.InterfaceSarada;

public class Sarada extends Uchiha implements InterfaceSarada{

    public void ativarSharigan() {
        System.out.println("Sharigan ativado!");
    }

    public void ativarMangekyou(){
        System.out.println("Mangekyou ativado!");
    }
}
