import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int numero = scan.nextInt();

        int fatorial = pegarFatorial(numero);

        System.out.println("O fatorial de "+ numero+ " é: "+ fatorial);

        scan.close();
   
    }
    
    static int pegarFatorial(int numero){
        int fatorial = 1;
        for(int contador = 2; contador <= numero; contador++){
            fatorial *= contador;
        }
        return fatorial;
    }
}
