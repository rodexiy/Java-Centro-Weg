import java.util.Scanner;

public class q4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o número: ");
        int numero = scan.nextInt();
        System.out.println("O número invertido fica: "+ reverse(numero));

        scan.close();
    }

    static String reverse(int numero){
        String sNumero = Integer.toString(numero);
        String reverse = "";
        for (int caracter = 0; caracter < sNumero.length(); caracter++ ){
            reverse += sNumero.charAt(sNumero.length() - caracter - 1);
        }

        return reverse;
    }
}
