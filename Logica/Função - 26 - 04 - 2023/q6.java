public class q6 {

    public static void main(String[] args){

        for (int contador = 1; contador <= 500; contador++){
            if (numeroPerfeito(contador)){
                System.out.println(contador+ " é um número perfeito");
            }
        }
    }


    static boolean numeroPerfeito(int numero){
        int somaDivisores = 0;

        for (int contador = 1; contador < numero; contador++){
            if (numero % contador == 0){
                somaDivisores += contador;
            }
        }

        return (somaDivisores == numero);
    }
}
