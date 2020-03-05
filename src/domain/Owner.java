package domain;

public class Owner {
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

    public Owner(String nome, int cpf, int rg){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }
}
