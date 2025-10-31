package ZeroAoAvançado.StreamAPI;

public class Reduce {

    public static void main(String[] args) {
        
        // Stream API - Reduce
        java.util.List<Integer> numeros = java.util.Arrays.asList(1, 2, 3, 4, 5); // Cria uma lista de números
        System.out.println("Números originais: " + numeros); // Imprime a lista original

        // Usa o Stream API para somar todos os números da lista
        Integer soma = numeros.stream()
                .reduce(0, (a, b) -> a + b); // Reduz a lista somando os elementos, começando de 0

        System.out.println("Soma dos números: " + soma); // Imprime a soma dos números


    }
    
}
