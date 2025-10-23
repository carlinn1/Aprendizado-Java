package OrientacaoObjetos.Interface;

public interface Conta { 
    // Definição da interface Conta
    // Métodos que devem ser implementados por qualquer classe que implemente esta interface
    // Isso define um contrato que garante que certas funcionalidades estarão disponíveis
    // para qualquer tipo de conta, independentemente da implementação específica
    // Interface serve para abstrair a funcionalidade comum entre diferentes tipos de contas
    // e promover a reutilização de código e a flexibilidade no design do sistema
    // Qualquer classe que implemente esta interface deve fornecer implementações concretas para todos os métodos definidos aqui

    double getNumero();
    String getTitular();
    double getSaldo();
    double getAgencia();

    void setNumero(double numero);
    void setTitular(String titular);
    void setSaldo(double saldo);
    void setAgencia(double agencia);
}
