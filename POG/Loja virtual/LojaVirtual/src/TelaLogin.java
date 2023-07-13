import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



public class TelaLogin extends JFrame {

	private JPanel contentPane;
	public JTextField tfNome;
	public JTextField tfSenha;

	/**
	 * Launch the application.
	 */
	
	public JButton btnLogar;  
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(124, 61, 46, 14);
		contentPane.add(lblNewLabel);
		
		tfNome = new JTextField();
		tfNome.setBounds(180, 58, 115, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(124, 103, 46, 14);
		contentPane.add(lblSenha);
		
		tfSenha = new JTextField();
		tfSenha.setColumns(10);
		tfSenha.setBounds(180, 100, 115, 20);
		contentPane.add(tfSenha);
		
		btnLogar = new JButton("Logar");

		btnLogar.setBounds(165, 153, 89, 23);
		contentPane.add(btnLogar);
	}
	
	 Cliente verificarLoginUsuarios(ArrayList<Cliente> clientesCadastrados) {
			for(int index = 0; index < clientesCadastrados.size(); index++) { 
				Cliente clienteValidar = clientesCadastrados.get(index);
				
				System.out.println(clienteValidar.getSenha());
				String nome = tfNome.getText();
				String senha = tfSenha.getText();
				if (clienteValidar.verificarLogin(nome, senha)) {
					return clientesCadastrados.get(index);
				}
			}
			Cliente clienteInvalido = new Cliente();
			clienteInvalido.setCadastrado(false);
			return clienteInvalido;
		}


}
