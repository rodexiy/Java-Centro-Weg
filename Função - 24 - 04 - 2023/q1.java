import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o número que deseja ter a tabuada: ");
        int numeroTabuada = scan.nextInt();

        int[] tabuada = tabuada(numeroTabuada);

        imprimirTabuada(tabuada);

        scan.close();
    }

    static void imprimirTabuada(int[] array){
        for (int contador = 0; contador < array.length; contador++){
            System.out.println("["+(contador+1)+"] "+ array[contador]);
        }
    }

    static int[] tabuada(int numeroTabuada){
        int[] array = new int[10];
        for (int contador = 0; contador < array.length; contador++){
            array[contador] = numeroTabuada * (contador + 1);
        }

        return array;
    }
}