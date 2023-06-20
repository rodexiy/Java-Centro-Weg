import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args){
    	
    	Cliente cliente = new Cliente();
    	cliente.cadastrar("Teste", "123456789");
    	cliente.setFormaDePagamento("carteira");
    	cliente.setCarteira(50);
    	
    	System.out.println(cliente.getLogin());
    	System.out.println(cliente.getSenha());

    	System.out.println(cliente.verificarLogin("Teste", "123456789"));
    	Produto produto1 = new Produto();
    	produto1.setNome("teste");
    	produto1.setPreco(120);
    	
    	Produto produto2 = new Produto();
    	produto2.setNome("anao");
    	produto2.setPreco(2);
    	
    	
    	Carrinho carrinho = new Carrinho();
    	cliente.setCarrinho(carrinho);
    	carrinho.addProduto(produto1, 5);
    	carrinho.addProduto(produto2, 2);
    	carrinho.calcularSubtotal();
    	
    	
    	Pagamento pagamento = new Pagamento();
    	pagamento.setCliente(cliente);
    	pagamento.setDesconto(150);
    	pagamento.setFrete(5);
    	pagamento.calcularPrecoFinal();
    	System.out.println(pagamento.getTotal());
    	pagamento.realizarPagamento();
    	

    	
//    	ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
//    	
//    	
//    	JButton bCadastro = new JButton("Cadastrar");
//    	JButton bLogin = new JButton("Login");
//    	
//        
//    	bCadastro.addActionListener(new ActionListener() {
//    		
//    		 @Override
//		    public void actionPerformed(ActionEvent e) {
//		        //your actions
//    			 JLabel JlNome = new JLabel("Nome");
//    			 JLabel JlNascimento = new JLabel("Data de nascimento");
//    			 JLabel JlNomeUsuario = new JLabel("Nome de usu�rio");
//    			 JLabel JlTelefone = new JLabel("Telefone");
//    			 JLabel JlEmail = new JLabel("Email");
//    			 JLabel JlSenha = new JLabel("Senha");
//    			 
//    			 JTextField JtNome = new JTextField();
//    			 JTextField JtNomeUsuario = new JTextField();
//    			 JTextField JtNascimento = new JTextField();
//    			 JTextField JtTelefone = new JTextField();
//    			 JTextField JtEmail = new JTextField();
//    			 JTextField JtSenha = new JTextField();
//    			 
//    			 Object[] cadastroComponents = {JlNome, JtNome, JlNascimento,
//    					 JtNascimento, JlNomeUsuario, JtNomeUsuario, JlTelefone, 
//    					 JtTelefone, JlEmail, JtEmail, JlSenha, JtSenha};
//    			 
//     		    JOptionPane.showMessageDialog(null, cadastroComponents, "Incio",
//    	                JOptionPane.DEFAULT_OPTION);
//		    };
//    	});
//    	
//    	bLogin.addActionListener(new ActionListener() {
//    		
//   		 @Override
//		    public void actionPerformed(ActionEvent e) {
//		        //your actions
//   			 
//   			 
//		   		JLabel JlNomeUsuario = new JLabel("Nome de usu�rio");
//		   		JLabel JlSenha = new JLabel("Senha");
//		   		JTextField JtNomeUsuario = new JTextField();
//		   		JTextField JtSenha = new JTextField();
//		   		
//		   		Object[] loginComponents = {JlNomeUsuario, JtNomeUsuario, JlSenha, JtSenha};
//		   		
//     		    JOptionPane.showMessageDialog(null, loginComponents, "Incio",
//    	                JOptionPane.DEFAULT_OPTION);
//		    }
//		});
//    	
//        Object[] obInicio = {bCadastro, bLogin};
//        JOptionPane.showMessageDialog(null, obInicio, "Incio",
//                JOptionPane.DEFAULT_OPTION);
    	
    	
//        JLabel lbNome = new JLabel("nome:");
//        JLabel lbPreco = new JLabel("pre�o:");
//        JLabel lbcategoria = new JLabel("categoria:");
//        JTextField txNome = new JTextField();
//        JTextField txPreco = new JTextField();
//        JComboBox cbCategoria = new JComboBox<>();
//        cbCategoria.addItem("Esportes");
//        cbCategoria.addItem("Infantil");
//        cbCategoria.addItem("Tecnologia");
//        cbCategoria.addItem("Roupas");
//        cbCategoria.addItem("Lazer");
//        cbCategoria.addItem("Cozinha");
//
//        Object[] obProdutos = {lbNome, txNome, lbPreco, txPreco, lbcategoria, cbCategoria};
//
//        JOptionPane.showMessageDialog(null, obProdutos, "Cadastrar produto",
//                JOptionPane.DEFAULT_OPTION);
//        
//        Produto p = new Produto();
//        p.setNome(txNome.getText());
//        p.setPreco(Double.parseDouble(txPreco.getText()));
//        p.setCategoria(cbCategoria.getSelectedItem().toString());
//        
//        listaProdutos.add(p);
//        
//        for(int index = 0; index < listaProdutos.size(); index++) {
//        	System.out.println("\nNome: "+ listaProdutos.get(index).getNome() +
//        			"\nPre�o: "+ listaProdutos.get(index).getPreco());
//        }
    }
}