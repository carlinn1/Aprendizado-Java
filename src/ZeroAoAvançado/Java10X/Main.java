package ZeroAoAvançado.Java10X;

import ZeroAoAvançado.Java10X.Herança.Ninja;
import ZeroAoAvançado.Java10X.Herança.Sarada;
import ZeroAoAvançado.Java10X.Herança.Uchiha;

public class Main {

    // extends usado para herança
    // implements para interfaces
    // @Override geralmente usado para polimorfismo, ele
    // Ele e usado para sobrescrever metodos gerais!

    public static void main(String[] args) {
        Uchiha uchiha = new Uchiha();
        Sarada sarada = new Sarada();


        uchiha.setNome("Sasuke Uchiha");
        uchiha.setIdade(18);
        uchiha.setAldeia("Aldeia da Folha");

        System.out.println("Nome: " + uchiha.getNome());
        System.out.println("Idade: " + uchiha.getIdade());
        System.out.println("Aldeia: " + uchiha.getAldeia());
        uchiha.sharinganAtivado();

        sarada.setNome("Sarada Uchiha");
        sarada.setIdade(18);
        sarada.setAldeia("Aldeia da Folha");
        sarada.ativarMangekyou();
        sarada.ativarSharigan();


    }
    
}
