package ZeroAoAvançado.StreamAPI;

public class Filter {

    public static void main(String[] args) {

        // Stream API - Filter
        java.util.List<Integer> numeros = java.util.Arrays.asList(1, 2, 3, 4, 5, 6); // Cria uma lista de números
        System.out.println("Números originais: " + numeros); // Imprime a lista original

        // Usa o Stream API para filtrar os números pares
        java.util.List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0) // Filtra apenas os números pares
                .toList(); // Coleta os resultados em uma nova lista

        System.out.println("Números pares: " + pares); // Imprime a lista de números pares
        
    }
    
}
