import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfTelefone;
	private JTextField tfEmail;
	private JTextField tfDataDeNascimento;
	private JTextField tfSenha;
	private JTextField tfConfirmarSenha;
	private JTextField tfCEP;
	
	public JButton btnCadastrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 33, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(10, 139, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Confirmar senha");
		lblNewLabel_1_1.setBounds(10, 163, 79, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("DataDeNascimento");
		lblNewLabel_1_1_1.setBounds(10, 114, 98, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Telefone");
		lblNewLabel_2.setBounds(10, 64, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setBounds(10, 89, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CEP");
		lblNewLabel_4.setBounds(267, 33, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		tfNome = new JTextField();
		tfNome.setBounds(57, 30, 86, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfTelefone = new JTextField();
		tfTelefone.setBounds(57, 61, 86, 20);
		contentPane.add(tfTelefone);
		tfTelefone.setColumns(10);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(57, 86, 86, 20);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
		
		tfDataDeNascimento = new JTextField();
		tfDataDeNascimento.setBounds(108, 111, 86, 20);
		contentPane.add(tfDataDeNascimento);
		tfDataDeNascimento.setColumns(10);
		
		tfSenha = new JTextField();
		tfSenha.setBounds(99, 136, 86, 20);
		contentPane.add(tfSenha);
		tfSenha.setColumns(10);
		
		tfConfirmarSenha = new JTextField();
		tfConfirmarSenha.setColumns(10);
		tfConfirmarSenha.setBounds(99, 160, 86, 20);
		contentPane.add(tfConfirmarSenha);
		
		tfCEP = new JTextField();
		tfCEP.setColumns(10);
		tfCEP.setBounds(294, 30, 86, 20);
		contentPane.add(tfCEP);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(335, 227, 89, 23);
		contentPane.add(btnCadastrar);
	}
	
	String validarCadastro() {
		String nome = tfNome.getText();
		String telefone = tfTelefone.getText();
		String email = tfEmail.getText();
		String senha = tfSenha.getText();
		String confSenha = tfConfirmarSenha.getText();
		
		Cliente clienteaux = new Cliente();
		
		if (!clienteaux.setNome(nome)) {
			return "nome invalido";
		}
		
		if (!clienteaux.setTelefone(telefone)) {
			return "telefone invalido!";
		}
		
		if (!clienteaux.setEmail(email)) {
			return "email invalido";
		}
		
		if (!senha.equals(confSenha)) {
			return "senhas não coincidem";
		}
		
		if (!clienteaux.setSenha(confSenha)) {
			return "senha invalida";
		}
		
		return "cadastrado";
	};
	
	Cliente cadastrar() {
		String nome = tfNome.getText(); 
		String telefone = tfTelefone.getText();
		String email = tfEmail.getText();
		String senha = tfSenha.getText();
		String confSenha = tfConfirmarSenha.getText();
		
		Cliente cliente = new Cliente();
		
		String callback = validarCadastro();

		if (callback.equals("cadastrado")) {
			cliente.setNome(nome);
			cliente.setTelefone(telefone);
			cliente.setEmail(email);
			cliente.setSenha(senha);
			cliente.setLogin(nome);
			cliente.setCadastrado(true);
			
		}else {
			JOptionPane.showMessageDialog(btnCadastrar, callback);
		}
		
		System.out.println(cliente.getCadastrado());
		
		return cliente;
	}
}
