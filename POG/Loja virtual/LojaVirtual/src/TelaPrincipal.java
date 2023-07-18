

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

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	public JMenuItem miTecnologia;
	public JPanel InterfaceProdutos;

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
		
		JMenuItem miEsportes = new JMenuItem("Esportes");
		mnNewMenu.add(miEsportes);
		
		miTecnologia = new JMenuItem("Tecnologia");
		mnNewMenu.add(miTecnologia);
		
		JMenuItem miCozinha = new JMenuItem("Cozinha");
		mnNewMenu.add(miCozinha);
		
		JMenuItem miBanheiro = new JMenuItem("Banheiro");
		mnNewMenu.add(miBanheiro);
		
		JMenuItem miVeiculos = new JMenuItem("Veiculos");
		mnNewMenu.add(miVeiculos);
		
		JMenu menuCarrinho = new JMenu("Carrinho");
		menuBar.add(menuCarrinho);
		
		JMenuItem miCarrinho = new JMenuItem("Produtos");
		menuCarrinho.add(miCarrinho);
		
		JMenu mnNewMenu_1 = new JMenu("Perfil");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Informa\u00E7\u00F5es");
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Sair");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		InterfaceProdutos = new JPanel();
		InterfaceProdutos.setBackground(new Color(255, 255, 255));
		InterfaceProdutos.setBounds(0, 0, 434, 239);
		contentPane.add(InterfaceProdutos);
		InterfaceProdutos.setLayout(new BoxLayout(InterfaceProdutos, BoxLayout.Y_AXIS));
			
	}
	
	public void AtualizarProdutos(ArrayList<Produto> produtosDaCategoria) {
		InterfaceProdutos.removeAll();
		
		for (Produto produto : produtosDaCategoria) {
            JButton label = new JButton(produto.getNome() + " - R$ " + produto.getPreco());
            InterfaceProdutos.add(label);
        }

		
	}
}
