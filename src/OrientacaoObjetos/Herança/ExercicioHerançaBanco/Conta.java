package OrientacaoObjetos.Herança.ExercicioHerançaBanco;

public class Conta {

    private double numeroConta;
    private String nomeCliente;
    private double saldoAtual;

    public void informaNumeroConta(double numeroConta){
        this.numeroConta = numeroConta;
    }

    public void informaNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    public void depositar (double saldoAtual){
        this.saldoAtual += saldoAtual;
    }

    public void sacar(double valorSaque){
        if (this.saldoAtual - valorSaque < 0){
            System.out.println("Saldo Insuficiente!");
            return;
        }
        this.saldoAtual -= valorSaque;

    }

    public double retronarSaldoAtual(){
        return this.saldoAtual;
    }

}
