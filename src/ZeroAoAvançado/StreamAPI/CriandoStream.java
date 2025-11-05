package ZeroAoAvançado.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CriandoStream {

    public static void main(String[] args) {
        // Criando uma Stream a partir de uma coleção
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        Stream<String> nameStream = names.stream();

        for (String name : (Iterable<String>) nameStream::iterator) {
            System.out.println(name);
        }
        
    }
}
