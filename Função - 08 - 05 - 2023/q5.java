import java.util.Random;

public class q5 {
    public static void main(String[] args){
        boolean fimDeJogo = false;
        boolean tirarDenovo = false;
        int numeroEspecial = 0;

        while (!fimDeJogo){
            int n1 = aleatorio(6);
            int n2 = aleatorio(6);
            int soma = n1 + n2;

            if (tirarDenovo){
                if (soma == 7){
                    fimDeJogo = true;
                    System.out.println("3 - Perdeu");
                }else if(soma == numeroEspecial){
                    fimDeJogo = true;
                    System.out.println("3 - Ganhou");
                }
            }

            if (soma > 7 && soma < 12){
                fimDeJogo = true;
                System.out.println("1 - Ganhou");
            }else if(soma == 2 || soma == 3 || soma == 12){
                System.out.println("2 - Perdeu");
                fimDeJogo = true;
            }else if (soma > 4 && soma < 10){   
                tirarDenovo = true;
                numeroEspecial = soma;
            }
        
        }
    }


    static int aleatorio(int max){
        return new Random().nextInt(    );
    }

}
