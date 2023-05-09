import java.util.Random;
import java.util.Scanner;

public class q4 {
    static Random rand = new Random();
    static int numeroSorteado;
    static int palpite;
    static int tentativas = 0;
    static boolean acertou = false;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        sortear();

        while (!acertou) {
            System.out.println("Insira um número: ");
            palpite = scan.nextInt();
            tentativas++;
            verificar();
        } 

        scan.close();
    }

    static void verificar(){
        if (palpite > numeroSorteado){
            System.out.println("O número sorteado é menor");
        }else if (palpite < numeroSorteado){
            System.out.println("O número sorteado é maior");
        }else{
            acertou = true;
            System.out.println("Você acertou!");
            System.out.println("Você tentou "+ tentativas + " vezes!");
        }
    }

    static void sortear(){
        numeroSorteado = rand.nextInt(1000);
    }

}
