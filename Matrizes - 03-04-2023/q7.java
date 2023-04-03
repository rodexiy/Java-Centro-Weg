import java.util.Random;

public class q7{
    public static void main(String[] args) {
        int[][] matriz = new int[7][4];
        Random rand = new Random();

        int menorLinha = 0, menorColuna = 0, menorNumero = 0;

        for (int linha = 0; linha < 7; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                matriz[linha][coluna] = rand.nextInt(200);
                if (linha == 0 && coluna == 0){
                    menorLinha = 0;
                    menorColuna = 0;
                    menorNumero = matriz[linha][coluna];
                }

                if (matriz[linha][coluna] > menorNumero){
                    menorLinha = linha;
                    menorColuna = coluna;
                    menorNumero = matriz[linha][coluna];
                }
                
            }
        }  
        System.out.println("Menor número: "+ menorNumero);
        System.out.println("Linha: "+ menorLinha);
        System.out.println("Coluna: "+ menorColuna);

    }
}