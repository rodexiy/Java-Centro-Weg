
public class Endereco {
    private String indentificacao;
    private String rua;
    private String cep;
    private String cidade;
    private String uf;
    private String numero;
    private String complemento;

    //Métodos

    /**
     * Retorna a identificação do Endereco
     * */
    public String getIndentificacao() {
        return indentificacao;
    }

    /**
     * Atribui a identificacao do endereco
     * @param indentificacao identificacao
     */
    public void setIndentificacao(String indentificacao) {
        this.indentificacao = indentificacao;
    }

    /**
     * retorna a rua do endereco
     * @return rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * atribui a rua ao endereço
     * @param rua rua
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * retorna o cep do endereço
     * @return cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * atribui o cep ao endereço
     * @param cep cep
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * retorna a cidade do endereço
     * @return cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * atribui a cidade ao endereço
     * @param cidade cidade
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * retorna a unidade federal
     * @return uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * atribui a uf ao endereço
     * @param uf
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * retorna o número do endereço
     * @return endereco
     */
    public String getNumero() {
        return numero;
    }

    /**
     * atribui o numero ao endereço
     * @param numero numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * retorna o complemento do endereço
     * @return complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * atribui o complemento ao endereço
     * @param complemento complemento
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

}