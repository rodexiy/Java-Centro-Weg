import java.util.Scanner;

public class q2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int numero = scan.nextInt();

        int valorAbsoluto = valor_absoluto(numero);

        System.out.println("O valor absoluto de "+ numero + " é : "+ valorAbsoluto);
        scan.close();
    }

    static int valor_absoluto(int numero){
        if (numero < 0){
            numero = -(numero);
        }
        return numero;
    }

}