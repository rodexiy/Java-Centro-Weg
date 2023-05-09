import java.util.Scanner;

public class q2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                if (linha == coluna) {
                    System.out.println("linha: "+ linha + " coluna: "+ coluna);
                }
            }
        }  



        

        scan.close();
    }
}