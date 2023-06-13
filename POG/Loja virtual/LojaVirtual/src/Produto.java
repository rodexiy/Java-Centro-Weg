/**
 * Classe para representar um produto.
 */
public class Produto {
    private String nome;
    private double preco;
    private String categoria;
    private String modelo;
    private String marca;
    private String cor;
    private int quantidadeEmEstoque;
    private String descricao;
    private int limiteDeCompra;

    /**
     * Obtém o nome do produto.
     *
     * @return O nome do produto.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Verifica se um nome é válido.
     *
     * @param nome O nome a ser verificado.
     * @return true se o nome for válido, caso contrário false.
     */
    private boolean nomeValido(String nome) {
        if (nome.length() > 0 && nome.matches("[A-Za-z\\s]*")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Define o nome do produto.
     *
     * @param nome O nome a ser definido.
     * @return true se o nome for válido e definido com sucesso, caso contrário false.
     */
    public boolean setNome(String nome) {
        if (nomeValido(nome)) {
            this.nome = nome;
            return true;
        } else {
            return false;
        }
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
     * @param preco O preço a ser definido.
     * @return true se o preço for válido e definido com sucesso, caso contrário false.
     */
    public boolean setPreco(double preco) {
        if (preco <= 0) {
            return false;
        }

        this.preco = preco;
        return true;
    }

    /**
     * Obtém a categoria do produto.
     *
     * @return A categoria do produto.
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define a categoria do produto.
     *
     * @param categoria A categoria a ser definida.
     * @return true se a categoria for válida e definida com sucesso, caso contrário false.
     */
    public boolean setCategoria(String categoria) {
        if (nomeValido(categoria)) {
            this.categoria = categoria;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Obtém o modelo do produto.
     *
     * @return O modelo do produto.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define o modelo do produto.
     *
     * @param modelo O modelo a ser definido.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Obtém a marca do produto.
     *
     * @return A marca do produto.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define a marca do produto.
     *
     * @param marca A marca a ser definida.
     * @return true se a marca for válida e definida com sucesso, caso contrário false.
     */
    public boolean setMarca(String marca) {
        if (nomeValido(marca)) {
            this.marca = marca;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Obtém a cor do produto.
     *
     * @return A cor do produto.
     */
    public String getCor() {
        return cor;
    }

    /**
     * Define a cor do produto.
     *
     * @param cor A cor a ser definida.
     * @return true se a cor for válida e definida com sucesso, caso contrário false.
     */
    public boolean setCor(String cor) {
        if (nomeValido(cor)) {
            this.cor = cor;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Obtém a quantidade em estoque do produto.
     *
     * @return A quantidade em estoque do produto.
     */
    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    /**
     * Define a quantidade em estoque do produto.
     *
     * @param quantidadeEmEstoque A quantidade em estoque a ser definida.
     */
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if (quantidadeEmEstoque < 0) {
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        } else {
            quantidadeEmEstoque = 0;
        }
    }

    /**
     * Obtém a descrição do produto.
     *
     * @return A descrição do produto.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do produto.
     *
     * @param descricao A descrição a ser definida.
     * @return true se a descrição for válida e definida com sucesso, caso contrário false.
     */
    public boolean setDescricao(String descricao) {
        if (descricao.length() >= 1000) {
            this.descricao = descricao;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Obtém o limite de compra do produto.
     *
     * @return O limite de compra do produto.
     */
    public int getLimiteDeCompra() {
        return limiteDeCompra;
    }

    /**
     * Define o limite de compra do produto.
     *
     * @param limiteDeCompra O limite de compra a ser definido.
     * @return true se o limite de compra for válido e definido com sucesso, caso contrário false.
     */
    public boolean setLimiteDeCompra(int limiteDeCompra) {
        if (limiteDeCompra > 0) {
            return false;
        }

        this.limiteDeCompra = limiteDeCompra;
        return true;
    }
}