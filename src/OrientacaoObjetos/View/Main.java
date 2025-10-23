package OrientacaoObjetos.View;

import OrientacaoObjetos.Controller.SaldoController;
import OrientacaoObjetos.Model.Conta;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao sistema bancário!");

        Conta conta1 = new Conta();

        conta1.setNumero(12345);
        conta1.setTitular("João Silva");
        conta1.setSaldo(1000.0);
        conta1.setAgencia(678);

        System.out.println("Número da Conta: " + conta1.getNumero());
        System.out.println("Titular: " + conta1.getTitular());
        System.out.println("Saldo: R$ " + conta1.getSaldo());
        System.out.println("Agência: " + conta1.getAgencia());

        SaldoController saldoController = new SaldoController();

        System.out.println("Saldo atual: R$ " + saldoController.obterSaldo(conta1));

        saldoController.depositar(conta1, 500.0);
        System.out.println("Saldo após depósito: R$ " + saldoController.obterSaldo(conta1));

        saldoController.sacar(conta1, 200.0);
        System.out.println("Saldo após saque: R$ " + saldoController.obterSaldo(conta1) + "\n Banco: " + conta1.getNubank());

        // Exibindo informações do banco
        //System.out.println("Banco: " + conta1.getNubank());
        //System.out.println("Banco: " + conta1.getInter());
        //System.out.println("Banco: " + conta1.getC6());
    }
    
}
