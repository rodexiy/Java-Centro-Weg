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
     * Obt�m o nome do produto.
     *
     * @return O nome do produto.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Verifica se um nome � v�lido.
     *
     * @param nome O nome a ser verificado.
     * @return true se o nome for v�lido, caso contr�rio false.
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
     * @return true se o nome for v�lido e definido com sucesso, caso contr�rio false.
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
     * Obt�m o pre�o do produto.
     *
     * @return O pre�o do produto.
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Define o pre�o do produto.
     *
     * @param preco O pre�o a ser definido.
     * @return true se o pre�o for v�lido e definido com sucesso, caso contr�rio false.
     */
    public boolean setPreco(double preco) {
        if (preco <= 0) {
            return false;
        }

        this.preco = preco;
        return true;
    }

    /**
     * Obt�m a categoria do produto.
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
     * @return true se a categoria for v�lida e definida com sucesso, caso contr�rio false.
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
     * Obt�m o modelo do produto.
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
     * Obt�m a marca do produto.
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
     * @return true se a marca for v�lida e definida com sucesso, caso contr�rio false.
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
     * Obt�m a cor do produto.
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
     * @return true se a cor for v�lida e definida com sucesso, caso contr�rio false.
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
     * Obt�m a quantidade em estoque do produto.
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
     * Obt�m a descri��o do produto.
     *
     * @return A descri��o do produto.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descri��o do produto.
     *
     * @param descricao A descri��o a ser definida.
     * @return true se a descri��o for v�lida e definida com sucesso, caso contr�rio false.
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
     * Obt�m o limite de compra do produto.
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
     * @return true se o limite de compra for v�lido e definido com sucesso, caso contr�rio false.
     */
    public boolean setLimiteDeCompra(int limiteDeCompra) {
        if (limiteDeCompra > 0) {
            return false;
        }

        this.limiteDeCompra = limiteDeCompra;
        return true;
    }
}