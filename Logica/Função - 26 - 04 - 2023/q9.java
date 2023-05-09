import java.util.Scanner;

public class q9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        int n1 = scan.nextInt();
        System.out.println("Insira o segundo número: ");
        int n2 = scan.nextInt();

        System.out.println("Resultado: "+ multiplicar(n1, n2));

        scan.close();
    }

    static int multiplicar(int numero1, int numero2){
        int soma = 0;
        for (int contador = numero1; contador > 1; contador = contador / 2){
            numero2 *= 2;

            if (numero2 % 2 != 0){
                soma += numero2;
            }
        }

        return soma;
    }
}
