package OrientacaoObjetos.Herança.ExerciciodeHerança;

public class Vendedor extends Funcionario{

    public Vendedor (int codigo, String nome){
        super(codigo, nome);
    }

    @Override
    public double getSalario(){
        double salarioAtual = super.getSalario();
        salarioAtual = salarioAtual + (salarioAtual * 0.25);
        return salarioAtual;
    }
}
