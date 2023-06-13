import java.util.ArrayList;

/**
 * Classe para representar um objeto Pagamento.
 */
public class Pagamento {
    private String forma;
    private int parcelamento;
    private double desconto;
    private double subTotal;
    private double total;
    private double frete;
    private Venda venda;
    private Cliente cliente;

    // Métodos

    /**
     * Obtém a forma de pagamento.
     *
     * @return A forma de pagamento.
     */
    public String getForma() {
        return forma;
    }

    /**
     * Define a forma de pagamento.
     *
     * @param forma A forma de pagamento a ser definida.
     * @return true se a forma de pagamento for válida e definida com sucesso, caso contrário false.
     */
    public boolean setForma(String forma) {
        ArrayList<String> FormasValidas = new ArrayList<String>();

        FormasValidas.add("pix");
        FormasValidas.add("boleto");
        FormasValidas.add("credito");
        FormasValidas.add("debito");
        FormasValidas.add("cartao");

        if (!FormasValidas.contains(forma)) {
            return false;
        }

        this.forma = forma;
        return true;
    }

    /**
     * Obtém o número de parcelas do pagamento.
     *
     * @return O número de parcelas do pagamento.
     */
    public int getParcelamento() {
        return parcelamento;
    }

    /**
     * Define o número de parcelas do pagamento.
     *
     * @param parcelamento O número de parcelas a ser definido.
     * @return true se o número de parcelas for válido e definido com sucesso, caso contrário false.
     */
    public boolean setParcelamento(int parcelamento) {
        if (parcelamento < 1) {
            return false;
        }

        this.parcelamento = parcelamento;
        return true;
    }

    /**
     * Obtém o desconto aplicado ao pagamento.
     *
     * @return O desconto aplicado ao pagamento.
     */
    public double getDesconto() {
        return desconto;
    }

    /**
     * Define o desconto a ser aplicado ao pagamento.
     *
     * @param desconto O desconto a ser aplicado.
     */
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    /**
     * Obtém o subtotal do pagamento.
     *
     * @return O subtotal do pagamento.
     */
    public double getSubTotal() {
        return this.subTotal;
    }

    /**
     * Define o subtotal do pagamento.
     *
     * @param subTotal O subtotal a ser definido.
     */
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    /**
     * Obtém o valor do frete do pagamento.
     *
     * @return O valor do frete do pagamento.
     */
    public double getFrete() {
        return frete;
    }

    /**
     * Define o valor do frete do pagamento.
     *
     * @param frete O valor do frete a ser definido.
     */
    public void setFrete(double frete) {
        this.frete = frete;
    }

    /**
     * Obtém a venda associada ao pagamento.
     *
     * @return A venda associada ao pagamento.
     */
    public Venda getVenda() {
        return venda;
    }
    /**
     * Define a venda associada ao pagamento.
     *
     * @param venda A venda a ser associada ao pagamento.
     */
    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    /**
     * Atualiza o valor total do pagamento com base no desconto, frete e número de parcelas.
     */
    public void atualizarTotal() {
        double valorDescontato = (getSubTotal() * getDesconto()) / 100;
        double valorComFrete = valorDescontato + getFrete();
        double valorPorParcela = valorComFrete / getParcelamento();

        this.total = valorPorParcela;
    }

    /**
     * Obtém o cliente associado ao pagamento.
     *
     * @return O cliente associado ao pagamento.
     */
    public Cliente getCliente() {
        return this.cliente;
    }

    /**
     * Define o cliente associado ao pagamento.
     *
     * @param cliente O cliente a ser associado ao pagamento.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    /**
     * Realiza o pagamento.
     *
     * @return true se o pagamento for bem-sucedido, caso contrário false.
     */
    public boolean realizarPagamento() {
        double valorAPagar = getSubTotal();
        Cliente cliente = getCliente();

        if (cliente.getFormasDePagamento().equals("carteira")) {
            if (cliente.getCarteira() >= valorAPagar) {
                return true;
            }
        }

        return false;
    }
}