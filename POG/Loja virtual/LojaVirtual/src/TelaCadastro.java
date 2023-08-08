

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;


public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfEmail;
	private JTextField tfDataDeNascimento;
	private JTextField tfCEP;
	
	public JButton btnCadastrar;
	private JFormattedTextField tfTelefone;
	private JPasswordField tfSenha;
	private JPasswordField tfConfirmarSenha;
	public JButton btnVoltar;

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
	 * @throws ParseException 
	 */
	public TelaCadastro() throws ParseException {
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
		lblNewLabel_1.setBounds(10, 179, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Confirmar senha");
		lblNewLabel_1_1.setBounds(10, 203, 79, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("DataDeNascimento");
		lblNewLabel_1_1_1.setBounds(10, 154, 98, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Telefone");
		lblNewLabel_2.setBounds(10, 96, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setBounds(10, 127, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CEP");
		lblNewLabel_4.setBounds(267, 33, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		tfNome = new JTextField();
		tfNome.setBounds(57, 30, 86, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(57, 124, 86, 20);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
		
		tfDataDeNascimento = new JTextField();
		tfDataDeNascimento.setBounds(108, 151, 86, 20);
		contentPane.add(tfDataDeNascimento);
		tfDataDeNascimento.setColumns(10);
		
		tfCEP = new JTextField();
		tfCEP.setColumns(10);
		tfCEP.setBounds(294, 30, 86, 20);
		contentPane.add(tfCEP);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(335, 227, 89, 23);
		contentPane.add(btnCadastrar);
		
		MaskFormatter mascaraTelefone = new MaskFormatter("'(##')' #####'-####");
		tfTelefone = new JFormattedTextField(mascaraTelefone);
		tfTelefone.setBounds(64, 90, 98, 23);
		contentPane.add(tfTelefone);
		
		tfSenha = new JPasswordField();
		tfSenha.setBounds(105, 176, 89, 20);
		contentPane.add(tfSenha);
		
		tfConfirmarSenha = new JPasswordField();
		tfConfirmarSenha.setBounds(108, 200, 89, 20);
		contentPane.add(tfConfirmarSenha);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(236, 227, 89, 23);
		contentPane.add(btnVoltar);
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
