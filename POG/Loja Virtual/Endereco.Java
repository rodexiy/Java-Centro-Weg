
public class Endereco {
    private String indentificacao;
    private String rua;
    private String cep;
    private String cidade;
    private String uf;
    private String numero;
    private String complemento;

    //Métodos

    public String getIndentificacao() {
        return indentificacao;
    }
    public void setIndentificacao(String indentificacao) {
        this.indentificacao = indentificacao;
    }

    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

}