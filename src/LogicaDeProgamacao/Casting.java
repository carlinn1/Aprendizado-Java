package LogicaDeProgamacao;

public class Casting {
    public static void main(String[] args) {

        //Conversao de Tipos

        int numero = 10;
        double d = numero;

        double d2 = 10.5;
        int num2 = (int) d2;

        Integer num3 = 10;
        String num4 = num3.toString();

        String num5 = "10";
        Integer num6 = Integer.parseInt(num5);

        System.out.println("Int para double: " + num2);
        System.out.println("Double para int: " + d);
        System.out.println("Integer para String: " + num4);
        System.out.println("String para Integer: " + num6);

    }
}
