import java.util.Random;

public class q10{
    public static void main(String[] args) {
        int[][] matriz = new int[3][4];
        Random rand = new Random();

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                matriz[linha][coluna] = rand.nextInt() * 100;
            }
        }  

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 4; coluna++)  {
                System.out.print(" "+matriz[linha][coluna]+ " ");
            }
            System.out.println("");
        }
        
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 4; coluna++)  {
                if (linha == 0 && coluna == 0) {
                    System.out.println("Canto superior esquerdo: "+ matriz[linha][coluna]);
                }else if(linha == 3 && coluna == 0){
                    System.out.println("Canto inferior esquerdo: "+ matriz[linha][coluna]);
                }
            }
        }

    }
}