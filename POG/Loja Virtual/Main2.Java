import javax.swing.*;

public class Main2 {
    public static void main(String[] args){
        JLabel lbNome = new JLabel("nome:");
        JLabel lbPreco = new JLabel("preço:");
        JLabel lbcategoria = new JLabel("categoria:");
        JTextField txNome = new JTextField();
        JTextField txPreco = new JTextField();
        JComboBox cbCategoria = new JComboBox();
        cbCategoria.addItem("Esportes");
        cbCategoria.addItem("Infantil");
        cbCategoria.addItem("Tecnologia");
        cbCategoria.addItem("Roupas");
        cbCategoria.addItem("Lazer");
        cbCategoria.addItem("Cozinha");

        Object[] obProdutos = {lbNome, txNome, lbPreco, txPreco, lbcategoria, cbCategoria};

        JOptionPane.showMessageDialog(null, obProdutos, "Cadastrar produto",
                JOptionPane.DEFAULT_OPTION);
    }
}