import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class TelaCliente {
	JLabel lbNome = new JLabel("Nome: ");
	JTextField txNome = new JTextField();
	
	Object[] componentes = {lbNome, txNome};
	
	JOptionPane.showMessageDialog(null, componentes);
}
