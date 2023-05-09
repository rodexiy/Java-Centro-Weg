import java.util.Scanner;


public class m2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[6];
        int pares = 0, impares = 0;

        for (int contador = 0; contador <= numeros.length; contador++) {
            System.out.println("Insira um número: ");
            numeros[contador] = scan.nextInt();
        }

        for (int contador = 0; contador < numeros.length; contador++) {
            if (numeros[contador] % 2 == 0) {
                System.out.println(numeros[contador] +" é par");
                pares++;
            }else{
                System.out.println(numeros[contador] +" é impar");
                impares++;
            }
        }
        
        System.out.println("Existe "+ pares + " números pares na lista");
        System.out.println("Existe "+ impares + " números impares na lista");

        scan.close();
    }
}
