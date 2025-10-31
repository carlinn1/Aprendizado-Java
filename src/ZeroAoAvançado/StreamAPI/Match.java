package ZeroAoAvançado.StreamAPI;

import java.util.function.Predicate;

public class Match {

    public static void main(String[] args) {
        // Stream API - Match
        java.util.List<String> aprovados = java.util.Arrays.asList("João", "Maria", "Pedro", "Ana", "Lucas"); // Cria uma lista de nomes
        System.out.println("Lista de aprovados: " + aprovados); // Imprime a lista original

        Predicate<String> comecaComA = nome -> nome.startsWith("A"); // Define a condição para o match (nomes que começam com 'A')

        // Usa o Stream API para verificar se todos os nomes começam com 'A'
        boolean todosComecamComA = aprovados.stream()
                .allMatch(comecaComA);

        System.out.println("Todos os nomes começam com 'A'? " + todosComecamComA);

        // Usa o Stream API para verificar se algum nome começa com 'A'
        boolean algumComecaComA = aprovados.stream()
                .anyMatch(comecaComA);

        System.out.println("Algum nome começa com 'A'? " + algumComecaComA);

        // Usa o Stream API para verificar se nenhum nome começa com 'A'
        boolean nenhumComecaComA = aprovados.stream()
                .noneMatch(comecaComA);

        System.out.println("Nenhum nome começa com 'A'? " + nenhumComecaComA);

        // all any none
        System.out.println(aprovados.stream().allMatch(nome -> nome.length() >= 3)); // true
        System.out.println(aprovados.stream().anyMatch(nome -> nome.length() >= 5)); // true
        System.out.println(aprovados.stream().noneMatch(nome -> nome.length() >= 10)); // true
    }
    
}
