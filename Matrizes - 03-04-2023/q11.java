
public class q11{
    public static void main(String[] args) {
        double[][] matriz = new double[7][8];

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                matriz[linha][coluna] = linha + coluna;
            } 
        }

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++)  {
                System.out.print(" "+matriz[linha][coluna]+ " ");
            }
            System.out.println("");
        }
    }
}