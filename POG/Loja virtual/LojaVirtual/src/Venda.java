

public class Venda {  
    public void gerarNotaFiscal(Pagamento pagamento) {
    	Cliente cliente = pagamento.getCliente();
    	Carrinho carrinho = cliente.getCarrinho();
    	
    	for (int index = 0; index < carrinho.getProdutos().size(); index++) {
    		Produto produto = carrinho.getProdutos().get(index);
    		Integer quantidade = carrinho.getQuantidades().get(index);
    		
    		System.out.println("Produto: "+ produto.getNome());
    		System.out.println("Quantidade: "+ quantidade);
    		

    	}
    	
    	
    }
}