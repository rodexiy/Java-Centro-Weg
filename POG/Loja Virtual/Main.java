import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args){
        JLabel lbLogin = new JLabel("Login");
        JLabel lbSenha = new JLabel("Senha");
        JTextField login = new JTextField();
        JPasswordField senha = new JPasswordField();

        JButton bt = new JButton("olho");

        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!(senha.getEchoChar()==(char)0)) {
                    senha.setEchoChar((char)0);
                }else
                    senha.setEchoChar('*');
            }
        });

        Object[] componentes = {lbLogin, login, lbSenha, senha, bt};

        JFrame inicio = new JFrame();


    }
}
