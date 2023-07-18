

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JTree;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;
import java.util.ArrayList;

public class TelaProduto extends JFrame {
	
	ArrayList<Produto> produtosCadastrados = new ArrayList<Produto>();

	
	private JPanel contentPane;
	private JTextField tfNomeProduto;
	private JTextField tfPreco;
	private JTextField tfEstoque;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProduto frame = new TelaProduto();
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
	public TelaProduto() {
		setTitle("Criar produto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(20, 20, 20));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		
		JLabel lbNomeProduto = new JLabel("Nome");
		lbNomeProduto.setForeground(new Color(207, 207, 207));
		lbNomeProduto.setBounds(10, 12, 45, 19);
		contentPane.setLayout(null);
		contentPane.add(lbNomeProduto);

		
		tfNomeProduto = new JTextField();
		tfNomeProduto.setForeground(new Color(255, 255, 255));
		tfNomeProduto.setBackground(new Color(134, 134, 134));
		tfNomeProduto.setBounds(75, 11, 123, 20);
		contentPane.add(tfNomeProduto);
		tfNomeProduto.setColumns(10);
		
		tfPreco = new JTextField();
		tfPreco.setForeground(new Color(255, 255, 255));
		tfPreco.setBackground(new Color(134, 134, 134));
		tfPreco.setColumns(10);
		tfPreco.setBounds(75, 42, 123, 20);
		contentPane.add(tfPreco);
		
		JLabel lbPreco = new JLabel("Preco");
		lbPreco.setForeground(new Color(207, 207, 207));
		lbPreco.setBounds(10, 43, 45, 19);
		contentPane.add(lbPreco);
		
		JLabel lbDescricao = new JLabel("Descricao");
		lbDescricao.setHorizontalAlignment(SwingConstants.CENTER);
		lbDescricao.setForeground(new Color(207, 207, 207));
		lbDescricao.setBounds(225, 12, 60, 19);
		contentPane.add(lbDescricao);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setForeground(new Color(207, 207, 207));
		lblCategoria.setBounds(10, 76, 60, 19);
		contentPane.add(lblCategoria);
		
		JComboBox cbCategoria = new JComboBox();
		cbCategoria.setModel(new DefaultComboBoxModel(new String[] {"Esportes", "Cozinha", "Tecnologia", "Banheiro", "Veículos"}));
		cbCategoria.setToolTipText("");
		cbCategoria.setBounds(75, 74, 123, 22);
		contentPane.add(cbCategoria);
		
		JTextPane tpDescricao = new JTextPane();
		tpDescricao.setBackground(new Color(167, 167, 167));
		tpDescricao.setBounds(285, 13, 123, 150);
		contentPane.add(tpDescricao);
		
		JLabel lbEstoque = new JLabel("Estoque");
		lbEstoque.setForeground(new Color(207, 207, 207));
		lbEstoque.setBounds(10, 106, 45, 19);
		contentPane.add(lbEstoque);
		
		JButton btSalvar = new JButton("Salvar");
		btSalvar.setBounds(327, 227, 97, 23);
		btSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = tfNomeProduto.getText();
				String categoria = String.valueOf(cbCategoria.getSelectedItem());
				String descricao = tpDescricao.getText();
				String sEstoque = tfEstoque.getText();
				String sPreco = tfPreco.getText();
				
				if (sPreco.matches("^\\d+$") && sEstoque.matches("^\\d+$")) {
					Float preco = Float.parseFloat(sPreco);
					int estoque = Integer.parseInt(sEstoque);
									
					Produto p = new Produto();
					p.setNome(nome);
					p.setCategoria(categoria);
					p.setDescricao(descricao);
					p.setPreco(preco);
					p.setEstoque(estoque);
					
					System.out.println("Nome: "+ p.getNome());
					System.out.println("Preço: "+ p.getPreco());
					System.out.println("Descrição: "+ p.getDescricao());
					System.out.println("Categoria: "+ p.getCategoria());
					System.out.println("Estoque: "+ p.getEstoque());	
					
					produtosCadastrados.add(p);
					JOptionPane.showMessageDialog(null, "Produto cadrastado: "+ nome);
				}

				
			}
		});
		contentPane.add(btSalvar);
		
		tfEstoque = new JTextField();
		tfEstoque.setForeground(Color.WHITE);
		tfEstoque.setColumns(10);
		tfEstoque.setBackground(new Color(134, 134, 134));
		tfEstoque.setBounds(75, 105, 123, 20);
		contentPane.add(tfEstoque);
		
		
		
	}
}