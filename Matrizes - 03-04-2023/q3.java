import java.util.Scanner;

public class q3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.println("Insira o um número: ");
                matriz[linha][coluna] = scan.nextInt();
            }
        }  

        
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                if (matriz[linha][coluna] < 0) {
                    matriz[linha][coluna] = 0;
                }
            }  
        }  

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.print(" " +matriz[linha][coluna]+" ");
            }  
            System.out.println("");
        }  
        

        scan.close();
    }
}