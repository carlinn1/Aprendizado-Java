package ZeroAoAvançado;

public class Iniciante {

    public static void main(String[] args) {

        // Imprima "Hello World" no console
        System.out.println("Hello World\n");

        // + - * / %
        int a = 10;
        int b = 3;
        System.out.println("Soma: " + (a + b)); // Adição
        System.out.println("Subtração: " + (a - b)); // Subtra
        System.out.println("Multiplicação: " + (a * b)); // Multiplicação
        System.out.println("Divisão: " + (a / b)); // Divisão
        System.out.println("Módulo: " + (a % b)); // Resto da divisão
        System.out.println();

        // > < >= <= == !=
        System.out.println("Comparações:");
        System.out.println("a > b: " + (a > b)); // Maior
        System.out.println("a < b: " + (a < b)); // Menor
        System.out.println("a >= b: " + (a >= b)); // Maior ou igual
        System.out.println("a <= b: " + (a <= b)); // Menor ou igual
        System.out.println("a == b: " + (a == b)); // Igualdade
        System.out.println("a != b: " + (a != b)); // Desigualdade
        System.out.println();

        // && || !
        boolean cond1 = true;
        boolean cond2 = false;
        System.out.println("Operadores Lógicos:");
        System.out.println("cond1 && cond2: " + (cond1 && cond2)); // E lógico
        System.out.println("cond1 || cond2: " + (cond1 || cond2)); // Ou lógico
        System.out.println("!cond1: " + (!cond1)); // Negação
        System.out.println();

        // Imprima "Executando o Hello World" 10 vezes no console
        // O for abaixo é uma estrutura de repetição que executa o bloco de código dentro dele 10 vezes
        // O i é uma variável de controle que começa em 0 e incrementa até chegar a 9
        for(int i = 0; i < 10; i++){
                System.out.println("Executando o Hello World");
        }
        

        // Declaração de variáveis de diferentes tipos de dados
        int idade = 25; // Variável do tipo inteiro
        double salario = 4500.50; // Variável do tipo ponto flutuante
        float altura = 1.75f; // Variável do tipo ponto flutuante (float)
        String nome = "João"; // Variável do tipo texto
        boolean estudante = true; // Variável do tipo booleano
        char letra = 'A'; // Variável do tipo caractere

        System.out.println("\nDados do usuário:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Altura: " + altura);
        System.out.println("Estudante: " + estudante);
        System.out.println("Letra: " + letra);


        //estrutura condicional if-else
        if(idade >= 18){
            System.out.println("\n" + nome + " é maior de idade.");
        } else {
            System.out.println("\n" + nome + " é menor de idade.");
        }

        //estrutura condicional switch-case
        int dia = 3;
        System.out.println("\nDia da semana:");
        switch(dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
                break;

            }

         //estrutura de repetição while
            System.out.println("\nContagem regressiva:");
            int contador = 5;
            while(contador > 0){
                System.out.println(contador);
                contador--; // Decrementa o contador em 5 ate 1
            }
        
        //estrutura de repetição do-while
            System.out.println("\nContagem progressiva:");
            int contagem = 1;
            do {
                System.out.println(contagem);
                contagem++; // Incrementa a contagem em 1 ate 5
            } while(contagem <= 5);

        //cast (de conversão de tipos)
        // O cast é usado para converter um tipo de dado em outro
            double notaDouble = 8.7;
            int notaInt = (int) notaDouble; // Converte double para int
            System.out.println("\nNota convertida de double para int: " + notaInt);

        //array (vetor)
            String[] frutas = {"Maçã", "Banana", "Laranja", "Uva"}; // Declaração e inicialização de um array de strings
            System.out.println("\nLista de frutas:"); // Imprime o array de frutas
            for(int j = 0; j < frutas.length; j++){ // Percorre o array usando um loop for
                // j é o índice do array que varia de 0 até o tamanho do array menos 1
                System.out.println(frutas[j]); // Imprime cada fruta do array
                    // frutas[j] acessa o elemento na posição j do array frutas
            }
        
        //ArrayList (lista dinâmica)
            java.util.ArrayList<String> carros = new java.util.ArrayList<>(); // Declaração de um ArrayList de strings
            carros.add("Ford"); // Adiciona elementos ao ArrayList
            carros.add("Chevrolet");
            carros.add("Toyota");
            System.out.println("\nLista de carros:"); // Imprime o ArrayList de carros
            for(String carro : carros){ // Percorre o ArrayList usando um loop for-each
                System.out.println(carro); // Imprime cada carro do ArrayList
            }

        // Metodos array e ArrayList importados diretamente add, delete, size, length
        // Array
        System.out.println("Tamanho do array de frutas: " + frutas.length); // Imprime o tamanho do array
        // frutas[2] = "Melancia"; // Altera um elemento do array
        System.out.println("Fruta na posição 2 do array: " + frutas[2]);
        // ArrayList
        System.out.println("Tamanho do ArrayList de carros: " + carros.size()); // Imprime o tamanho do ArrayList
        carros.remove("Chevrolet"); // Remove um elemento do ArrayList
        System.out.println("Tamanho do ArrayList de carros após remoção: " + carros.size());

        // Metodos do java lowercase, uppercase, length, substring
        String exemplo = "Exemplo de String";;
        System.out.println("\nExemplo de métodos de String:");
        System.out.println("Lowercase: " + exemplo.toLowerCase()); // Converte para minúsculas
        System.out.println("Uppercase: " + exemplo.toUpperCase()); // Converte para maiúsculas
        System.out.println("Length: " + exemplo.length()); // Retorna o tamanho da string
        System.out.println("Substring (0, 7): " + exemplo.substring(0, 7)); // Retorna uma substring da string

        //Scanner para entrada de dados
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("\nDigite seu nome: ");
        String nomeInput = scanner.nextLine(); // Lê uma linha de texto
        System.out.print("Digite sua idade: ");
        int idadeInput = scanner.nextInt(); // Lê um número inteiro
        System.out.println("Olá " + nomeInput + ", você tem " + idadeInput + " anos.");
        scanner.close(); // Fecha o scanner


        //try-catch para tratamento de exceções
        System.out.println("\nExemplo de tratamento de exceções:"); // Bloco try-catch
        try {
            int resultado = a / 0; // Tentativa de divisão por zero
            System.out.println("Resultado: " + resultado); // Imprime o resultado se não houver exceção
        } catch (ArithmeticException e) { // Captura a exceção de divisão por zero
            System.out.println("Erro: Divisão por zero não é permitida."); // Mensagem de erro
        }


        // metodos e funcoes
        System.out.println("\nResultado da soma de 5 e 10: " + soma(5, 10)); // Chama o método soma e imprime o resultado
    }

    // Método para somar dois números
    public static int soma(int a, int b) {
        return a + b;
    }
}