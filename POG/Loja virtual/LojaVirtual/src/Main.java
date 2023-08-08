

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Main {
		
	static Cliente clienteAtual;
	static ArrayList<Cliente> clientesCadastrados = new ArrayList<Cliente>();
	static ArrayList<Produto> produtosCadastrados = new ArrayList<Produto>();
	static ArrayList<Produto> produtosTecnologia = new ArrayList<Produto>();
	
	
    public static void main(String[] args) throws ParseException{
    	Produto computador = new Produto();
    	computador.setNome("Computador");
    	computador.setPreco(20000);
    	computador.setDescricao("Processador Ryzen 7 5800X, 32gb de RAM, B550m Aorus Elite, 2tb ssd");
    	produtosTecnologia.add(computador);
    	produtosCadastrados.add(computador);
    	
    	TelaPrincipal telaPrincipal = new TelaPrincipal();
		TelaLoginCadastro telaLoginCadastro = new TelaLoginCadastro();
		telaLoginCadastro.setVisible(true);

		TelaCadastro telaCadastro = new TelaCadastro();
		TelaLogin telaLogin = new TelaLogin();
		

	
		telaLoginCadastro.btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaCadastro.setVisible(true);
				telaLoginCadastro.setVisible(false);
			}
		});
		
		telaLoginCadastro.btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaLogin.setVisible(true);
				telaLoginCadastro.setVisible(false);
			}
		});
		
		telaCadastro.btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente cliente = telaCadastro.cadastrar();

				System.out.println(cliente.getCadastrado());
				if (cliente.getCadastrado() == false) {
					System.out.println("Cliente invalido");
				}else {
					clientesCadastrados.add(cliente);
					
					telaLoginCadastro.setVisible(true);
					telaCadastro.setVisible(false);
				}
				
			}
		});
		
		telaLogin.btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clienteAtual = telaLogin.verificarLoginUsuarios(clientesCadastrados);
				
				if (!clienteAtual.getCadastrado()) {
					JOptionPane.showMessageDialog(telaLogin, "Nome ou senha inválido!");
				}else {
					telaPrincipal.setVisible(true);
					telaLogin.setVisible(false);
				}
				

			}
		});
		
		telaCadastro.btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaCadastro.setVisible(false);
				telaLoginCadastro.setVisible(true);
			}
		});
		
		telaLogin.btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaLogin.setVisible(false);
				telaLoginCadastro.setVisible(true);
			}
		});
		
		

		
		JPanel MostrarProduto = new JPanel();
		MostrarProduto.setBounds(0, 0, 436, 241);
		telaPrincipal.getContentPane().add(MostrarProduto);
		
		JPanel Carrinho = new JPanel();
		Carrinho.setBounds(0, 0, 436, 241);
		telaPrincipal.getContentPane().add(Carrinho);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 436, 241);
		telaPrincipal.getContentPane().add(panel);
		

		//botao sair
		telaPrincipal.miSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaPrincipal.setVisible(false);
				telaLoginCadastro.setVisible(true);
			}
		});
		
		telaPrincipal.btnProdutoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaPrincipal.InterfaceProdutos.setVisible(true);
				telaPrincipal.InterfaceProduto.setVisible(false);
			}
		});
		
		
		for (int index = 0; index < produtosCadastrados.size(); index++) {
			JButton botaoProduto = new JButton();
			Produto produtoAtual = produtosCadastrados.get(index);
			
			botaoProduto.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					telaPrincipal.InterfaceProdutos.setVisible(false);
					telaPrincipal.InterfaceProduto.setVisible(true);
					telaPrincipal.atualizarTelaProduto(produtoAtual);
					
				}
			});
			
			botaoProduto.setText(produtoAtual.getNome()+ " | R$" +produtoAtual.getPreco());
			telaPrincipal.InterfaceProdutos.add(botaoProduto);
			
		}
		
		

		
    }
}