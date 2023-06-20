import java.util.ArrayList;

/**
 * Classe para representar um objeto Pagamento.
 */
public class Pagamento {
    private String forma;
    private int parcelamento;
    private float desconto;
    private float total;
    private float frete;
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
    public float getDesconto() {
        return desconto;
    }

    /**
     * Define o desconto a ser aplicado ao pagamento.
     *
     * @param desconto O desconto a ser aplicado.
     */
    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public boolean setTotal(float total) {
    	if (this.total >= 0) {
    		this.total = total;
    		return true;
    	}
    	return false;
    }
    
    public float getTotal() {
    	return this.total;
    }
    
    
    /**
     * Calcula o preço final do pagamento, com os descontos e frete.
     * @return 
     */
    
    public float calcularPrecoFinal() {	
    	Carrinho carrinho = this.cliente.getCarrinho();
    	float precoComDesconto = carrinho.getSubtotal() - (carrinho.getSubtotal() * getDesconto() / 100);
    	float precoComFrete = precoComDesconto + getFrete();
    	
    	setTotal(precoComFrete);
    	
    	return precoComFrete;
    	
    }

    /**
     * Obtém o valor do frete do pagamento.
     *
     * @return O valor do frete do pagamento.
     */
    public float getFrete() {
        return frete;
    }

    /**
     * Define o valor do frete do pagamento.
     *
     * @param frete O valor do frete a ser definido.
     */
    public void setFrete(float frete) {
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

    public double calcularParcelas() {
    	return getTotal() / getParcelamento(); 
    }
 
    /**
     * Realiza o pagamento.
     *
     * @return true se o pagamento for bem-sucedido, caso contrário false.
     */
    public boolean realizarPagamento() {
        double valorAPagar = calcularPrecoFinal();
        Cliente cliente = getCliente();
        cliente.getCarrinho().calcularSubtotal();
        

    	Venda venda = new Venda();
    	setVenda(venda);
        
        if (cliente.getFormasDePagamento().equals("carteira")) {
            if (cliente.getCarteira() >= valorAPagar) {
            	System.out.println("--- Comprou ---");
            	venda.gerarNotaFiscal(this);
            	
            	cliente.
                return true;
            }
        }

        return false;
    }
}