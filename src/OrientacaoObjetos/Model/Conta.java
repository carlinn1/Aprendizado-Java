package OrientacaoObjetos.Model;

public class Conta extends BancoHerança { // A classe Conta herda da classe BancoHerança

    // private quando queremos que o atributo seja acessível apenas dentro da própria classe
    // Isso ajuda a proteger os dados e garantir que eles sejam manipulados de maneira controlada

    // protected quando queremos que o atributo seja acessível dentro do mesmo pacote e por subclasses
    // Isso permite um nível adicional de acesso para classes relacionadas, mas ainda mantém a proteção contra

    // Public quando queremos que o atributo seja acessível de qualquer lugar do código
    // Isso é útil para atributos que precisam ser amplamente acessíveis, mas deve ser usado com cuidado

    // Extends indica que a classe Conta está herdando atributos e métodos da classe BancoHerança
    // Isso promove a reutilização de código e estabelece uma relação "é um" entre as classes

    // implements indica que a classe Conta está implementando os métodos definidos na interface BancoInterface
    // Isso garante que a classe Conta forneça implementações específicas para os métodos declarados na interface

    //

    // Atributos da classe Conta

    private double numero;
    private String titular;
    private double saldo;
    private double agencia;

    // Construtor com parâmetros
    public Conta(double numero, String titular, double saldo, double agencia) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.agencia = agencia;
    }

    // Construtor padrão
    public Conta() {
    }

    // Getters e Setters
    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getAgencia() {
        return agencia;
    }

    public void setAgencia(double agencia) {
        this.agencia = agencia;
    }

}
