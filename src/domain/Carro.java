package domain;

public class Carro {
    private String modelo;
    private String cor;
    private int ano;
    private String marca;
    private int chassi;
    private Proprietario proprietario;
    private double velocidadeMaxima;
    private double velocidadeAtual;
    private int numeroPortas;
    private boolean tetoSolar;
    private int numeroMarchas;
    private boolean cambioAutomatico;
    private double volumeCombustivel;

    public void acelera(){
        velocidadeAtual++;
    }

    public void freia(){
        velocidadeAtual = 0;
    }

    public void trocaMarca(int novaMarcha){
        numeroMarchas = novaMarcha;
    }

    public void reduzMarcha(){
        numeroMarchas--;
    }
}
