import java.util.Scanner;

public class q6{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int soma = 0, pares = 0;

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.println("Insira um número: ");
                matriz[linha][coluna] = scan.nextInt();
                if (matriz[linha][coluna] % 2 == 0) {
                    soma += matriz[linha][coluna];
                    pares++;
                }
            }
        }  

        System.out.println("Média: "+ (soma/(pares)));
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) 
                if (matriz[linha][coluna] % 2 == 0) {
                    System.out.print(matriz[linha][coluna]+ ", ");
                }
            }
        
        

        scan.close();
    }
}