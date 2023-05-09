import java.util.Scanner;
public class q13{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int A, B;
        System.out.println("Insira a temperatura em graus Fahrenheit: ");
        System.out.println("Insira o valor: ");
        A = scan.nextInt();
        System.out.println("Insira a potencia: ");
        B = scan.nextInt();
        
        System.out.println("A potencia é: "+ potencia(A, B));

        scan.close();
    }

    static int potencia(int numero, int quantitade){
        int potencia = numero;

        for(int contador = 1; contador < quantitade; contador++){
            potencia *= numero;
        }

        return potencia;
    }
}
