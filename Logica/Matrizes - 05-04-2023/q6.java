import java.util.Random;
public class q6 {
    public static void main(String[] args){
        Random random = new Random();
        int[][] matriz = new int[5][5];

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                matriz[linha][coluna] = random.nextInt(100);
            }
        }

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                boolean meio = (linha == (matriz.length - 1) / 2 && coluna == (matriz.length - 1) / 2);
                boolean lado = ((linha == 0 || linha == matriz.length - 1) && (coluna == 0 || coluna == matriz.length - 1));
               if (meio || lado){
                    System.out.print(" "+matriz[linha][coluna] +" ");
               }else{
                    System.out.print(" - ");
               }
            }
            System.out.println("");
        }
    }
}
