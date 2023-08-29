/**
 * A classe abstrata ProdutoWEG representa um produto fabricado pela WEG.
 * Esta classe fornece informações básicas sobre o produto, como tipo, código, preço e especificações técnicas.
 */
public abstract class ProdutoWEG {
    private String codigo;       // O código único do produto.
    private String tipo;         // O tipo do produto.
    private double potencia;     // A potência do produto em unidades específicas.
    private double tensao;       // A tensão de operação do produto.
    private int capacidade;      // A capacidade do produto (quantidade, volume, etc.).
    private double preco;        // O preço do produto.

    /**
     * Construtor da classe ProdutoWEG.
     *
     * @param tipo   O tipo do produto.
     * @param codigo O código único do produto.
     * @param preco  O preço do produto.
     */
    public ProdutoWEG(String tipo, String codigo, double preco) {
        this.setTipo(tipo);
        this.setCodigo(codigo);
        this.setPreco(preco);
    }

    /**
     * Obtém o código do produto.
     *
     * @return O código do produto.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define o código do produto.
     *
     * @param codigo O código único do produto.
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtém o tipo do produto.
     *
     * @return O tipo do produto.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o tipo do produto.
     *
     * @param tipo O tipo do produto.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtém a potência do produto.
     *
     * @return A potência do produto.
     */
    public double getPotencia() {
        return potencia;
    }

    /**
     * Define a potência do produto.
     *
     * @param potencia A potência do produto em unidades específicas.
     */
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    /**
     * Obtém a tensão de operação do produto.
     *
     * @return A tensão de operação do produto.
     */
    public double getTensao() {
        return tensao;
    }

    /**
     * Define a tensão de operação do produto.
     *
     * @param tensao A tensão de operação do produto.
     */
    public void setTensao(double tensao) {
        this.tensao = tensao;
    }

    /**
     * Obtém a capacidade do produto.
     *
     * @return A capacidade do produto.
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * Define a capacidade do produto.
     *
     * @param capacidade A capacidade do produto (quantidade, volume, etc.).
     */
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    /**
     * Obtém o preço do produto.
     *
     * @return O preço do produto.
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Define o preço do produto.
     *
     * @param preco O preço do produto.
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    /**
     * Imprime todas as informações do produto no console. Subclasses devem sobrescrever
     * este método para fornecer informações específicas do produto.
     */
    public void imprimirInformacoes() {
        // Este método deve ser sobrescrito nas subclasses para fornecer informações específicas.
    }
    
    
}
