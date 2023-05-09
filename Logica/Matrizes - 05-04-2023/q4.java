import java.util.Scanner;
public class q4{
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        Scanner scan = new Scanner(System.in);

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                System.out.println("Insira um número: ");
                matriz[linha][coluna] = scan.nextInt();

                if (matriz[linha][coluna] < 0) {
                    matriz[linha][coluna] = 0;
                }
            }
        }

        System.out.println("Todos os elementos: ");
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                System.out.print(" "+ matriz[linha][coluna] +" ");
            }
            System.out.println("");
        }

        scan.close();


    }
}