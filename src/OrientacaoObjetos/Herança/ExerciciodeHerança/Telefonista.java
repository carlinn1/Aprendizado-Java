package OrientacaoObjetos.Herança.ExerciciodeHerança;

public class Telefonista extends Funcionario{

    public Telefonista(int codigo, String nome){
        super(codigo, nome);
    }

    @Override
    public double getSalario(){
        double salarioAtual = super.getSalario();
        salarioAtual = salarioAtual + (salarioAtual * 0.10);
        return salarioAtual;
    }
}
