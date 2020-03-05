package domain;

public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private int cep;
    private String complemento;

    public Endereco(String rua, String bairro, String cidade, String estado, int cep) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public int getCep() {
        return cep;
    }

    public String getComplemento() {
        return complemento;
    }
}
