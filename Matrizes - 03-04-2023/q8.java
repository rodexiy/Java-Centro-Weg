import java.util.Random;

public class q8 {
    public static void main(String[] args) {
        int[][] M = new int[5][5];
        Random rand = new Random();

        int somaTotal = 0;
        for (int linha = 0; linha < M.length; linha++){
            for (int coluna = 0; coluna < M.length; coluna++){
                M[linha][coluna] = rand.nextInt(100);
                somaTotal += M[linha][coluna];
            }  
        }

        int somaLinha4 = 0;
        int somaColuna2 = 0;
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;

        for (int coluna = 0; coluna < M.length; coluna++){
            somaLinha4 += M[4][coluna];
        }  

        for (int linha = 0; linha < M.length; linha++){
            somaColuna2 += M[linha][2];
        }  

        for (int linha = 0; linha < M.length; linha++){
            for (int coluna = 0; coluna < M.length; coluna++){
                if (linha == coluna) {
                    somaDiagonalPrincipal += M[linha][coluna];
                }
            }  
        }  

        for (int linha = 0; linha < M.length; linha++){
            somaDiagonalSecundaria += M[linha][M.length - 1 - linha];
        }  
        
        System.out.println("Soma da linha 4:"+ somaLinha4);
        System.out.println("Soma da coluna 2:"+ somaColuna2);
        System.out.println("Soma diagonal principal:"+ somaDiagonalPrincipal);
        System.out.println("Soma diagonal secundaria:"+ somaDiagonalSecundaria);
        System.out.println("Soma da matriz: "+ somaTotal);

        for(int linha = 0; linha < M.length; linha++) {
            for(int coluna = 0; coluna < M.length; coluna++) {
                System.out.print(" "+ M[linha][coluna]+ " ");
            }
            System.out.println("");
        }

    }
}
