

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.ScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JList;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Scrollbar;
import java.util.ArrayList;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTable;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	public JMenuItem miTecnologia;
	public JPanel InterfaceProdutos;
	public JMenuItem miSair;
	public JMenuItem miEsportes;
	public JMenuItem miCozinha;
	public JMenuItem miBanheiro;
	public JMenuItem miVeiculos;
	public JPanel InterfaceProduto;
	
	private JLabel lbEstoque;
	private JLabel lbTitulo;
	private JTextPane lbDescricao;
	private JLabel lbPreco;
	public JButton btnProdutoVoltar;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Produtos");
		menuBar.add(mnNewMenu);
		
		miEsportes = new JMenuItem("Esportes");
		mnNewMenu.add(miEsportes);
		
		miTecnologia = new JMenuItem("Tecnologia");
		mnNewMenu.add(miTecnologia);
		
		miCozinha = new JMenuItem("Cozinha");
		mnNewMenu.add(miCozinha);
		
		miBanheiro = new JMenuItem("Banheiro");
		mnNewMenu.add(miBanheiro);
		
		miVeiculos = new JMenuItem("Veiculos");
		mnNewMenu.add(miVeiculos);
		
		JMenu menuCarrinho = new JMenu("Carrinho");
		menuBar.add(menuCarrinho);
		
		JMenuItem miCarrinho = new JMenuItem("Produtos");
		menuCarrinho.add(miCarrinho);
		
		JMenu mnNewMenu_1 = new JMenu("Perfil");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem miInformacoes = new JMenuItem("Informa\u00E7\u00F5es");
		mnNewMenu_1.add(miInformacoes);
		
		miSair = new JMenuItem("Sair");
		mnNewMenu_1.add(miSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		InterfaceProduto = new JPanel();
		InterfaceProduto.setBounds(0, 0, 434, 239);
		contentPane.add(InterfaceProduto);
		InterfaceProduto.setVisible(false);
		InterfaceProduto.setLayout(null);
		
		lbTitulo = new JLabel("New label");
		lbTitulo.setFont(new Font("Tw Cen MT", Font.PLAIN, 23));
		lbTitulo.setBounds(22, 11, 402, 14);
		InterfaceProduto.add(lbTitulo);
		
		lbEstoque = new JLabel("New label");
		lbEstoque.setHorizontalAlignment(SwingConstants.LEFT);
		lbEstoque.setBounds(191, 183, 207, 14);
		InterfaceProduto.add(lbEstoque);
		
		JButton btnColocarCarrinho = new JButton("Adicionar ao carrinho");
		btnColocarCarrinho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnColocarCarrinho.setBounds(287, 196, 137, 32);
		InterfaceProduto.add(btnColocarCarrinho);
		
		lbDescricao = new JTextPane();
		lbDescricao.setBounds(191, 36, 207, 100);
		InterfaceProduto.add(lbDescricao);
		
		lbPreco = new JLabel("New label");
		lbPreco.setBounds(191, 158, 207, 14);
		InterfaceProduto.add(lbPreco);
		
		btnProdutoVoltar = new JButton("Voltar");
		btnProdutoVoltar.setBounds(10, 196, 79, 32);
		InterfaceProduto.add(btnProdutoVoltar);
		
		JPanel InterfaceCarrinho = new JPanel();
		InterfaceCarrinho.setBounds(0, 0, 434, 241);
		contentPane.add(InterfaceCarrinho);
		InterfaceCarrinho.setVisible(false);
		InterfaceCarrinho.setLayout(null);
		
		
		JPanel InterfaceInformacoes = new JPanel();
		InterfaceInformacoes.setBounds(0, 0, 434, 241);
		contentPane.add(InterfaceInformacoes);
		InterfaceInformacoes.setVisible(false);
		InterfaceInformacoes.setLayout(null);
		
		InterfaceProdutos = new JPanel();
		InterfaceProdutos.setBounds(0, 0, 434, 239);
		contentPane.add(InterfaceProdutos);
		InterfaceProdutos.setBackground(new Color(255, 255, 255));
		InterfaceProdutos.setVisible(true);
		InterfaceProdutos.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			
	}
	
	public void atualizarTelaProduto(Produto produto) {
		lbPreco.setText("Preço: R$"+ produto.getPreco());
		lbEstoque.setText("Estoque: "+ produto.getEstoque());
		lbTitulo.setText(produto.getNome());
		lbDescricao.setText(produto.getDescricao());
	}
}
