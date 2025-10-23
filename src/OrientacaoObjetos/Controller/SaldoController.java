package OrientacaoObjetos.Controller;

import OrientacaoObjetos.Model.Conta;

public class SaldoController {

    // Controlador para gerenciar operações relacionadas ao saldo da conta
    // Métodos para obter saldo, depositar e sacar
    // Esses métodos interagem com a classe Conta para manipular o saldo de forma segura
    // Isso ajuda a separar a lógica de negócios da representação dos dados

    public double obterSaldo(Conta conta) {
        return conta.getSaldo();
    }

    public void depositar(Conta conta, double valor) {
        conta.setSaldo(conta.getSaldo() + valor);
    }

    public void sacar(Conta conta, double valor) {
        conta.setSaldo(conta.getSaldo() - valor);
    }
    
}
