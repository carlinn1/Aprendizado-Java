package OrientacaoObjetos.Herança.ExerciciodeHerança;

public class Gerente extends Funcionario{

     public Gerente(int codigo, String nome){
         super(codigo, nome);
     }

     @Override
        public double getSalario(){
         double salarioAtual = super.getSalario();
         salarioAtual = salarioAtual + (salarioAtual * 0.45);
         return salarioAtual;
     }
}
