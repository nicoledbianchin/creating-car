package domain;

public class Proprietario {
    private String nome;
    private int cpf;
    private int rg;
    private int dataNascimento;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private int cep;
    private String complemento;

    public Proprietario(String nome, int cpf, int rg){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }
}
