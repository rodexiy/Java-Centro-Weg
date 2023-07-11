import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLoginCadastro extends JFrame {

	
	private JPanel contentPane;
	
	public JButton btnCadastro;
	public JButton btnLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLoginCadastro frame = new TelaLoginCadastro();
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
	public TelaLoginCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Selecione a op\u00E7\u00E3o");
		lblNewLabel.setBounds(174, 11, 86, 14);
		contentPane.add(lblNewLabel);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
			}
		});
		btnLogin.setBounds(174, 81, 89, 23);
		contentPane.add(btnLogin);
		
		btnCadastro = new JButton("Cadastro");

		btnCadastro.setBounds(174, 115, 89, 23);
		contentPane.add(btnCadastro);
	}

}
