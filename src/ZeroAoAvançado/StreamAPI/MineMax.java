package ZeroAoAvançado.StreamAPI;

public class MineMax {
    public static void main(String[] args) {
        // Stream API - Min e Max
        java.util.List<Integer> numeros = java.util.Arrays.asList(5, 3, 8, 1, 4); // Cria uma lista de números
        System.out.println("Números originais: " + numeros); // Imprime a lista original

        // Usa o Stream API para encontrar o valor mínimo na lista
        Integer min = numeros.stream()
                .min(Integer::compareTo) // Encontra o valor mínimo usando comparação natural
                .orElse(null); // Retorna null se a lista estiver vazia

        System.out.println("Valor mínimo: " + min); // Imprime o valor mínimo

        // Usa o Stream API para encontrar o valor máximo na lista
        Integer max = numeros.stream()
                .max(Integer::compareTo) // Encontra o valor máximo usando comparação natural
                .orElse(null); // Retorna null se a lista estiver vazia

        System.out.println("Valor máximo: " + max); // Imprime o valor máximo
        
    }
}
