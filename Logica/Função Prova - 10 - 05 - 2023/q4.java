import java.util.Scanner;

public class q4 {
    
    public static void main(String[] args){
        double[] numeros = new double[20];
        Scanner scan = new Scanner(System.in);
        for (int contador = 0; contador < numeros.length; contador++){
            System.out.println("Insira um número: ");
            numeros[contador] = scan.nextDouble();
        }

        if (verificarRepetido(numeros) == false) {
            System.out.println("Não há numeros repetidos!");
        }else{
            while (verificarRepetido(numeros) == true){
                double numeroRepetido = retornarRepetido(numeros);
                System.out.println("Numero repetido: "+ numeroRepetido);
                numeros = gerarNovaArray(numeros, numeroRepetido);
                for (double numero: numeros){
                    System.out.print(numero+ ", ");
                }
                System.out.println("");
                System.out.println("");
            }
        }

        scan.close();

       
    }

    static double[] gerarNovaArray(double[] numeros, double numeroRemover){
        double[] novaArray = new double[numeros.length - 1];
        boolean removido = false;

        for (int contador = 0; contador < numeros.length; contador++){
            if (numeros[contador] == numeroRemover && removido == false){
                removido = true;
            }else{
                if (removido == false) {
                    novaArray[contador] = numeros[contador];
                }else {
                    novaArray[contador - 1] = numeros[contador];
                }
            }
        }

        return novaArray;
    }

    static boolean verificarRepetido(double[] numeros){
        boolean repetiu = false;

        for (int contador1 = 0; contador1 < numeros.length; contador1++){
            for (int contador2 = 1; contador2 < numeros.length; contador2++){
                if (numeros[contador1] == numeros[contador2] && contador1 != contador2){
                    repetiu = true;
                }
            }
        }

        return repetiu;
    }

    static double retornarRepetido(double[] numeros){
        double numeroRepetido = 0;

        for (int contador1 = 0; contador1 < numeros.length; contador1++){
            for (int contador2 = 1; contador2 < numeros.length; contador2++){
                if (numeros[contador1] == numeros[contador2] && contador1 != contador2){
                    numeroRepetido = numeros[contador1];
                }
            }
        }

        return numeroRepetido;
    }
}
