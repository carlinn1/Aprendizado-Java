package ZeroAoAvançado.Java10X.Variados;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {


        //push para adicionar
        //pop tirar elementos
        //peek verifica qual proximo
        //size ver o tamanho
        Stack<String> ninjasStack = new Stack<>();
        ninjasStack.push("Paulo");
        ninjasStack.push("Carlos");
        ninjasStack.push("Henrique");
        ninjasStack.push("Layon");
        System.out.println(ninjasStack);

        ninjasStack.pop();
        System.out.println(ninjasStack);

        System.out.println("Proximo Elemento: " + ninjasStack.peek());

        System.out.println("Tamanho da Stack: " + ninjasStack.size());
    }
}
