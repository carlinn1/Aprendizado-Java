package ZeroAoAvançado.StreamAPI;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ListIteratorStream {

    public static void main(String[] args) {

        // Usando Stream para percorrer a lista de nomes
        // O Stream permite operações funcionais e paralelas
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);

        // Usando Iterator para percorrer a lista de nomes 
        // O Iterator permite percorrer a coleção de forma sequencial
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        

        }

    }
    
}
