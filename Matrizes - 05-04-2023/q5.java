public class q5 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                if (linha == coluna){
                    System.out.println("Linha e coluna são iguais!");
                }
            }
        }


    }
}