package OrientacaoObjetos.Herança.ExercicioHerançaBanco;

public class ContaPoupança extends Conta{

    public void aplicaRendimento(double percentual){
        double saldo = retronarSaldoAtual();
        double rendimento = saldo * (percentual / 100);
        depositar(rendimento);
    }

}
