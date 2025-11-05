package ZeroAoAvançado.TratamentoErros;

public class TiposErros {
    
    public static void main(String[] args) throws Exception {
        
        // Exemplo de erro de compilação (uncomment para ver o erro)
        // int numero = "Texto"; // Erro: incompatible types: String cannot be converted to int

        // Exemplo de erro em tempo de execução

        
        metodoComErroChecado();
        metodoComErroNaoChecado();

        try {
            int resultado = 10 / 0; // Isso causará uma ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Erro em tempo de execução: " + e.getMessage());
        }

    }

   

    // Exeção checada e não checada
    private static void metodoComErroChecado() throws Exception {
        throw new Exception("Este é um erro checado.");
    }

    private static void metodoComErroNaoChecado() {
        throw new RuntimeException("Este é um erro não checado.");
    }
}
