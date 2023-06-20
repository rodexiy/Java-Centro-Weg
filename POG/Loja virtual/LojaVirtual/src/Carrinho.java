
import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Integer> quantidades = new ArrayList<Integer>();
    private ArrayList<Produto> produtos = new ArrayList<>();
    private float subtotal;
    
    public boolean addProduto(Produto produto, Integer quantidade) {
    	produtos.add(produto);
    	quantidades.add(quantidade);
    	return true;
    }
    
    public boolean removeProduto(int index) {
    	produtos.remove(index);
    	quantidades.remove(index);
    	return true;
    }
    
    
    public ArrayList<Produto> getProdutos() {
    	return this.produtos;
    }
    
    public ArrayList<Integer> getQuantidades() {
    	return this.quantidades;
    }
    
   
    
    public float calcularSubtotal() {
    	float subtotalFinal = 0;
    	
    	for (int index = 0; index < produtos.size(); index++) {
    		 subtotalFinal += produtos.get(index).getPreco() * quantidades.get(index);
    	}
    	
    	this.subtotal = subtotalFinal;
    	
    	return subtotalFinal;
    }
    
    public float getSubtotal() {
    	return this.subtotal;
    }


}