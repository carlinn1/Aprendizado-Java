package OrientacaoObjetos.Herança.ExercicioHerançaBanco;

public class Main {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupança contaPoupança = new ContaPoupança();

        contaCorrente.informaNumeroConta(4667);
        contaCorrente.informaNomeCliente("Carlos Henrique");
        contaCorrente.depositar(500);
        System.out.println("DEPOSITADO 500,00. VALOR DA CONTA: " + contaCorrente.retronarSaldoAtual());

        contaCorrente.sacar(100);
        System.out.println("SAQUE 100,00. VALOR DA CONTA: " + contaCorrente.retronarSaldoAtual());

        contaCorrente.sacar(900);

        System.out.println();
        System.out.println();

        contaPoupança.informaNumeroConta(4500);
        contaPoupança.informaNomeCliente("Taturana");
        contaPoupança.depositar(800);

        System.out.println("Valor da Poupança: " + contaPoupança.retronarSaldoAtual());
        contaPoupança.aplicaRendimento(5);

        System.out.println("Valor da Conta depois do Rendimento: " + contaPoupança.retronarSaldoAtual());


    }
}
