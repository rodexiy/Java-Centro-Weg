import java.util.Scanner;
public class q1{
    public static void main(String[] args) {
        int[][] matriz = new int[6][6];
        boolean encontrou = false;

        Scanner scan = new Scanner(System.in);

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                System.out.println("Insira um número: ");
                matriz[linha][coluna] = scan.nextInt();
            }
        }

        System.out.println("Insira um número de referência: ");
        int numero = scan.nextInt();

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                if (matriz[linha][coluna] == numero) {
                    System.out.println("O número está na linha "+ linha + " e na coluna: "+ coluna);
                    encontrou = true;
                    break;
                }
            }
        }

        if (!encontrou) {
            System.out.println("O número não existe na lista!");
        }

        scan.close();
        
    }
}