package OrientacaoObjetos.Herança.ExerciciodeHerança;

public class Funcionario extends Pessoa{

    public Funcionario() {
        super();
    }

    public Funcionario(int codigo, String nome){
        super(codigo, nome);
    }

    public double getSalario(){
        return 2000.00;
    }

    public String imprimirFolhaPagamento(){
        return "Codigo: " + getCodigo() + " - Nome: " + getNome() + " - Salario: " + getSalario();
    }

}
