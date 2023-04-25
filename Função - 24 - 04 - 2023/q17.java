
import java.util.Scanner;

public class q17{
    

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        System.out.println("Insira um caractere: ");
        int digito = scan.nextInt();

        if (verificaDigito(digito)) {
            System.out.println("É um digito");
        }else{
            System.out.println("Não é um digito");
        }

        scan.close();
    }

    static boolean verificaDigito(int digito){
        return (digito == 0 || digito == 1 || digito == 2 || digito == 3 || digito == 4 || digito == 5 || digito == 6 || digito == 7 || digito == 8 || digito == 9);
    }
}
