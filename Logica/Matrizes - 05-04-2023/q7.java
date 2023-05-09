import java.util.Random;
import java.util.Scanner;

public class q7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Insira o tamanho da linha: ");
        int Tlinha = scan.nextInt();
        System.out.println("Insira o tamanho da coluna: ");
        int Tcoluna = scan.nextInt();

        int[][] matriz = new int[Tlinha][Tcoluna];

        for (int linha = 0; linha < Tlinha; linha++){
            for (int coluna = 0; coluna < Tcoluna; coluna++){
                matriz[linha][coluna] = random.nextInt(100);
            }
        }


            for (int linha = 0; linha < Tlinha; linha++){
                for (int coluna = 0; coluna < Tcoluna; coluna++){
                    boolean lado = ((linha == 0 || linha == Tlinha - 1) && (coluna == 0 || coluna == Tcoluna - 1));
                    //boolean meio = (linha == (matriz.length - 1) / 2 && coluna == (matriz.length - 1) / 2);
                    boolean meio = ((linha != 0 && coluna != 0) && (linha != Tlinha - 1 && coluna != Tcoluna - 1));
                    
                    if (lado || meio) {
                        System.out.print(" "+ matriz[linha][coluna] + " ");
                    }else{
                        System.out.print(" - ");
                    }
                }
                System.out.println("");
            }
        


        scan.close();
    }
}
