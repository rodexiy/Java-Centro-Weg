import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.JFrame;
import java.util.ArrayList;

public class Main {
		
	
	
    public static void main(String[] args){
    	ArrayList<Cliente> clientesCadastrados = new ArrayList<Cliente>();
		Cliente clienteAtual;
    	
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
				final Cliente clienteAtual = telaLogin.verificarLoginUsuarios(clientesCadastrados);
				
				if (!clienteAtual .getCadastrado()) {
					JOptionPane.showMessageDialog(telaLogin, "Nome ou senha inválido!");
				}
				
				System.out.println("Nome: "+ clienteAtual.getNome());
			}
		});
		
    	
    }
}