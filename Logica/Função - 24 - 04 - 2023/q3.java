import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int numero = scan.nextInt();

        boolean par = ePar(numero);
        
        if (par) {
            System.out.println("O número é par!");
        }else{
            System.out.println("O número é impar!");
        }

        scan.close();
   
    }
    
    static boolean ePar(int numero){
        return (numero % 2) == 0;
    }
}
