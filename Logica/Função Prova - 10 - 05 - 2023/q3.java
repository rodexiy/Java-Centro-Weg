import java.util.Scanner;

public class q3 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double numero;
        System.out.println("Insira o número: ");
        numero = scan.nextDouble();

        String[] partes = fracionaria(numero);
        System.out.println("Parte Inteira: "+ partes[0]);
        System.out.println("Parte Fracionaria: "+ partes[1]);


        scan.close();
    }

    static String[] fracionaria(double numero){
        String[] partes = new String[2];
        String numeroTexto = Double.toString(numero);

        partes[0] = "";
        partes[1] = "";

        System.out.println("Numero texto: "+ numeroTexto);
        int numerosAteOPonto = 0;
        for (int caracter = 0; caracter < numeroTexto.length(); caracter++){
            if (numeroTexto.charAt(caracter) == '.'){
                for (int caracter2 = 0; caracter2 < numerosAteOPonto; caracter2++){
                    partes[0] += numeroTexto.charAt(caracter2);
                }

                for (int caracter2 = numerosAteOPonto + 1; caracter2 < numeroTexto.length(); caracter2++){
                    partes[1] += numeroTexto.charAt(caracter2);
                }
            }else{

            }
            numerosAteOPonto++;
        }

        return partes;
    }
}
