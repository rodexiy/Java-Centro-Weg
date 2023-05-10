import java.util.Scanner;

public class q1{
    public static void main(String[] args){
        int[] listaDeNumeros = new int[20];

        Scanner scan = new Scanner(System.in);

        for (int contador = 0; contador < 20; contador++){
            System.out.println("Insira um número: ");
            listaDeNumeros[contador] = scan.nextInt();
        }

        int maisRepetido = numeroMaisRepetido(listaDeNumeros);

        System.out.println("O número mais repetido é: "+ maisRepetido);
        scan.close();
    }

    
    static int numeroMaisRepetido(int[] numeros){
        int[] quantidadeDeCada = new int[numeros.length];
        int[] indice = new int[numeros.length];

        for (int contador1 = 0; contador1 < indice.length; contador1++){
            for (int contador2 = 1; contador2 < indice.length; contador2++){
                if (numeros[contador1] != numeros[contador2] && contador1 != contador2){
                    indice[contador1] = numeros[contador1];
                    quantidadeDeCada[contador1] = 1;
                }
            }
        }

        for (int contador1 = 0; contador1 < indice.length; contador1++){
            for (int contador2 = 1; contador2 < indice.length; contador2++){
                if (numeros[contador1] == numeros[contador2] && contador1 != contador2){
                    quantidadeDeCada[contador1] += 1;
                }
            }
        }

        int maisRepetido = 0;
        int quantidadeMaisRepetida = 0;
        for (int contador = 0; contador < indice.length; contador++){
            if (contador == 0){
                quantidadeMaisRepetida = quantidadeDeCada[contador];
                maisRepetido = indice[contador];
            }else if(quantidadeDeCada[contador] > quantidadeMaisRepetida){
                quantidadeMaisRepetida = quantidadeDeCada[contador];
                maisRepetido = indice[contador];
            }
        }

        return maisRepetido;
    }
}