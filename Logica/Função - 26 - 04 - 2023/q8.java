import java.util.Scanner;

public class q8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        for (int contador = 1000; contador <= 9999; contador++){
            if (possuiPropriedade(contador))
                System.out.print(contador+", "); 
        }

        scan.close();
    }

    static boolean possuiPropriedade(Integer numero){
        int soma = numero % 100 + numero / 100; 
        int mult = soma * soma;

        return (mult == numero);
    }
}
