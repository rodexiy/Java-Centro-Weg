

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

public class Main {
		
	static Cliente clienteAtual;
	static ArrayList<Cliente> clientesCadastrados = new ArrayList<Cliente>();
	static ArrayList<Produto> produtosCadastrados = new ArrayList<Produto>();
	static ArrayList<Produto> produtosTecnologia = new ArrayList<Produto>();
	
	
    public static void main(String[] args) throws ParseException{

    	/** */
    	Produto computador = new Produto();
    	computador.setNome("Computador");
    	computador.setPreco(20000);
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
		
		telaPrincipal.miTecnologia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaPrincipal.AtualizarProdutos(produtosTecnologia);
				Object[] componentes = telaPrincipal.getComponents();
				for (int i = 0; i < componentes.length; i++) {
					System.out.println(componentes[i]);
					if (componentes[i].getClass().getSimpleName() != "JButton") {continue;};
					// JButton botao = componentes[i];
					
					
				}
			}
		});
		

		
    }
    
}