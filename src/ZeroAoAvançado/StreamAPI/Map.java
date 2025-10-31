package ZeroAoAvançado.StreamAPI;

public class Map {

    public static void main(String[] args) {
        // Stream API - Map
        java.util.List<Integer> numeros = java.util.Arrays.asList(1, 2, 3, 4, 5); // Cria uma lista de números
        System.out.println("Números originais: " + numeros); // Imprime a lista original

        // Usa o Stream API para mapear cada número para o seu quadrado
        java.util.List<Integer> quadrados = numeros.stream()
                .map(n -> n * n) // Mapeia cada número para o seu quadrado
                .toList(); // Coleta os resultados em uma nova lista

        System.out.println("Números ao quadrado: " + quadrados); // Imprime a lista de quadrados
    }
    
}
