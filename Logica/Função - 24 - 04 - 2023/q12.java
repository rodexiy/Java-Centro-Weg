import java.util.Scanner;
public class q12{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int A, B;
        System.out.println("Insira a temperatura em graus Fahrenheit: ");
        System.out.println("Insira o valor de A: ");
        A = scan.nextInt();
        System.out.println("Insira o valor de B: ");
        B = scan.nextInt();
        
        System.out.println("Multiplicação: "+ multiplicar(A, B));

        scan.close();
    }

    static int multiplicar(int x, int y){
        return x * y;
    }
}
