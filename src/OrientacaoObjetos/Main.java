package OrientacaoObjetos;

public class Main {
    public static void main(String[] args) {

        // public, default, protected, private
        // extends = Herança ele herda da classe pai
        // polimorfismo = objetos do mesmo tipo com resultados diferentes!
        // Estrutura MVC Model,View, Controler

        //        Professor professor = new Professor();
        //        System.out.println(professor.getNome());
        //        System.out.println(professor.getIdade());

        Metodos mtd = new Metodos();
        mtd.somar();
        mtd.subtrai();
        mtd.multiplica();
        mtd.divisao();
        mtd.media();

    }
}
