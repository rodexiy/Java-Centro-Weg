import java.util.Scanner;

public class q5{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.println("Insira o um número: ");
                matriz[linha][coluna] = scan.nextInt();
            }
        }  

        System.out.println("Só a diagonal");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                if (linha == coluna) {
                    System.out.print("" +matriz[linha][coluna]+"");
                }else{
                    System.out.print(" - ");
                }
            }  
            System.out.println("");
        }  

        System.out.println("Sem a diagonal");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                if (linha != coluna) {
                    System.out.print(" " +matriz[linha][coluna]+" ");
                }else{
                    System.out.print(" - ");
                }
            }  
            System.out.println("");
        }  




        

        scan.close();
    }
}