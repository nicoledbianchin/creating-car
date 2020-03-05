package domain;

public class Proprietario {
    private String nome;
    private int cpf;
    private int rg;
    private int dataNascimento;
    private Endereco endereco;

    public Proprietario(String nome, int cpf, int rg, Endereco endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
    }
}
