import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
    	ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
    	
    	
        JLabel lbNome = new JLabel("nome:");
        JLabel lbPreco = new JLabel("preço:");
        JLabel lbcategoria = new JLabel("categoria:");
        JTextField txNome = new JTextField();
        JTextField txPreco = new JTextField();
        JComboBox cbCategoria = new JComboBox<>();
        cbCategoria.addItem("Esportes");
        cbCategoria.addItem("Infantil");
        cbCategoria.addItem("Tecnologia");
        cbCategoria.addItem("Roupas");
        cbCategoria.addItem("Lazer");
        cbCategoria.addItem("Cozinha");

        Object[] obProdutos = {lbNome, txNome, lbPreco, txPreco, lbcategoria, cbCategoria};

        JOptionPane.showMessageDialog(null, obProdutos, "Cadastrar produto",
                JOptionPane.DEFAULT_OPTION);
        
        Produto p = new Produto();
        p.setNome(txNome.getText());
        p.setPreco(Double.parseDouble(txPreco.getText()));
        p.setCategoria(cbCategoria.getSelectedItem().toString());
        
        listaProdutos.add(p);
        
        for(int index = 0; index < listaProdutos.size(); index++) {
        	System.out.println("\nNome: "+ listaProdutos.get(index).getNome() +
        			"\nPreço: "+ listaProdutos.get(index).getPreco());
        }
    }
}