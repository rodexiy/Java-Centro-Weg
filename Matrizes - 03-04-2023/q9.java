import java.util.Random;
public class q9 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int[][] aoCubo = new int[matriz.length][matriz.length];
        Random rand = new Random();

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                matriz[linha][coluna] = rand.nextInt(100);
                int numero = matriz[linha][coluna];
                aoCubo[linha][coluna] = numero * numero * numero;
            }  
        }

        for(int linha = 0; linha < matriz.length; linha++) {
            for(int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.print(" "+ matriz[linha][coluna]+ " ");
            }
            System.out.println("");
        }

        System.out.println("Ao cubo: ");
        for(int linha = 0; linha < aoCubo.length; linha++) {
            for(int coluna = 0; coluna < aoCubo.length; coluna++) {
                System.out.print(" "+ aoCubo[linha][coluna]+ " ");
            }
            System.out.println("");
        }

        
        
    }
}
