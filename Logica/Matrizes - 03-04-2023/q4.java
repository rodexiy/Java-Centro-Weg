import java.util.Scanner;

public class q4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[6][6];
        int reference;

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.println("Insira o um número: ");
                matriz[linha][coluna] = scan.nextInt();
            }
        }  

        System.out.println("Insira um número de referência: ");
        reference = scan.nextInt();

        boolean found = false;
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                if (matriz[linha][coluna] == reference) {
                    System.out.println("O número se encontra na linha: "+ linha+
                    " e na coluna: "+ coluna+ "!"
                    );
                    found = true;
                    break;
                }
            }
        }
        if (found == false) {
            System.out.println("O número não existe na matriz!");
        }
        

        scan.close();
    }
}