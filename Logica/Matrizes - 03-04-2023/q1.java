import java.util.Scanner;
import java.util.Random;

public class q1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrizA = new int[5][5];
        int[][] matrizB = new int[5][5];
        
        int[][] matrizSom = new int[matrizA.length][matrizA.length];
        int[][] matrizSub = new int[matrizA.length][matrizA.length];
        int[][] matrizMul = new int[matrizA.length][matrizA.length];

        Random rand = new Random();

        for (int linha = 0; linha < matrizA.length; linha++){
            for (int coluna = 0; coluna < matrizA.length; coluna++){
                matrizA[linha][coluna] = rand.nextInt(100);
                matrizB[linha][coluna] = rand.nextInt(100);
            }
        }

        boolean continuar = true;

        while (continuar) {
            System.out.println("[1] Somar");
            System.out.println("[2] Subtrair");
            System.out.println("[3] Multiplicar");
            System.out.println("[0] Sair");
            
            System.out.println("O que deseja fazer?");
            int escolha = scan.nextInt();
            int[][] mostrarMatriz = new int[5][5];

            switch(escolha){
                case 1:
                    for (int linha = 0; linha < matrizA.length; linha++){
                        for (int coluna = 0; coluna < matrizA.length; coluna++){
                            matrizSom[linha][coluna] = matrizA[linha][coluna] + matrizB[linha][coluna];
                        }
                    }
                    mostrarMatriz = matrizSom;
                    break;
                case 2:
                    for (int linha = 0; linha < matrizA.length; linha++){
                        for (int coluna = 0; coluna < matrizA.length; coluna++){
                            matrizSub[linha][coluna] = matrizA[linha][coluna] - matrizB[linha][coluna];
                        }
                    }
                    mostrarMatriz = matrizSub;
                    break;
                case 3:
                    for (int linha = 0; linha < matrizA.length; linha++){
                        for (int coluna = 0; coluna < matrizA.length; coluna++){
                            matrizMul[linha][coluna] = matrizA[linha][coluna] * matrizB[linha][coluna];
                        }
                    }
                    mostrarMatriz = matrizMul;
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("Número inválido!");
            }

            
            if (continuar) {
                for (int linha = 0; linha < mostrarMatriz.length; linha++) {
                    for (int coluna = 0; coluna < mostrarMatriz.length; coluna++) {
                        System.out.print(" " +mostrarMatriz[linha][coluna]+" ");
                    }  
                    System.out.println("");
                }  
            }
            
        }

        

        scan.close();
    }
}