import java.util.Random;
public class q2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                matriz[linha][coluna] = random.nextInt(100);
            }
        }

        System.out.println("Todos os elementos: ");
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                System.out.print(" "+ matriz[linha][coluna] +" ");
            }
            System.out.println("");
        }

        System.out.println("Somente diagonal principal: ");
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                if (linha == coluna){
                    System.out.print(" "+ matriz[linha][coluna] +" ");
                }else{
                    System.out.print(" - ");
                }   
            }
            System.out.println("");
        }

        System.out.println("Todos exceto diagonal principal: ");
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                if (linha == coluna){
                    System.out.print(" - ");
                }else{
                    System.out.print(" "+ matriz[linha][coluna] +" ");
                }   
            }
            System.out.println("");
        }

        
        System.out.println("Somente diagonal secundaria: ");
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                if (coluna == matriz.length - 1 - linha){
                    System.out.print(" "+ matriz[linha][matriz.length - 1 - linha] +" ");
                }else{
                    System.out.print(" - ");
                }
            }
            System.out.println("");
        }

        System.out.println("todos exceto secundaria: ");
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                if (coluna == matriz.length - 1 - linha){
                    System.out.print(" - ");
                }else{
                    System.out.print(" "+ matriz[linha][coluna] +" ");
                }
            }
            System.out.println("");
        }


        System.out.println("todos diagonal principal e secundaria: ");
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                if ((coluna == matriz.length - linha - 1) || linha == coluna){
                    System.out.print(" "+ matriz[linha][coluna] +" ");
                }else{
                    System.out.print(" - ");
                }
            }
            System.out.println("");
        }

        System.out.println("todos diagonal principal e secundaria: ");
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                if ((coluna == matriz.length - 1 - linha) || linha == coluna){
                    System.out.print(" - ");
                }else{
                    System.out.print(" "+ matriz[linha][coluna] +" ");
                }
            }
            System.out.println("");
        }




    }

}