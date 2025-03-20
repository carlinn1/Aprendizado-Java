package OrientacaoObjetos;

public class Carro {

    private String cor;
    private String tamanho;
    private int numRodas;

    public Carro(String cor, String tamanho, int numRodas) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.numRodas = numRodas;
    }

    public void exibirCaracteristicas(){
        System.out.println("Cor do Carro: " + cor);
        System.out.println("Tamanho do carro: " + tamanho);
        System.out.println("Quantidade de Rodas: " + numRodas);
    }
    public static void main(String[] args) {

        Carro carro = new Carro("Vermelho", "SUV", 4);
        carro.exibirCaracteristicas();

    }

}
