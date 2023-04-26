import java.util.Scanner;


public class q5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);      

        System.out.println("Insira o range de primos: ");
        int[] arrayprimos = primos(scan.nextInt());

        imprimir(arrayprimos);

        scan.close();
    }

    static int[] primos(int range){
        int quantidadePrimos = 0;
        int indexprimo = 0;

        for(int contador = 1; contador <= range; contador++){
            boolean primo = true;
            for(int divisor = 1; divisor <= contador; divisor++){
                if (contador % divisor == 0 && contador != divisor && divisor != 1){
                    primo = false;
                }
                if (contador % divisor == 0 && contador == divisor && primo){
                    quantidadePrimos++;
                }
            }
        }

        int[] numerosPrimos = new int[quantidadePrimos];
        
        for(int contador = 1; contador <= range; contador++){
            boolean primo = true;
            for(int divisor = 1; divisor <= contador; divisor++){
                if (contador % divisor == 0 && contador != divisor && divisor != 1){
                    primo = false;
                }
                if (contador % divisor == 0 && contador == divisor && primo){
                    numerosPrimos[indexprimo] = contador;
                    indexprimo++;
                }
            }
        }

        return numerosPrimos;
    }

    static void imprimir(int[] array){
        for (int numero: array) {
            System.out.print(numero +", ");
        }
    }
}
