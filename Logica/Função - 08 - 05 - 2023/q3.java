import java.util.Scanner;

public class q3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o número: ");
        Integer numero = scan.nextInt();
        System.out.println("Quantidade de digitos: "+ quantidadeDeDigitos(numero));

        scan.close();
    }

    static int quantidadeDeDigitos(Integer numero){
        return numero.toString().length();
    }
}
