import java.util.Scanner;

public class q3 {
    static char[] numerico = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};    
    static char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w','x', 'y', 'z'};
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a cadeia de caracteres: ");
        String cadeia = scan.next();

        System.out.println(Dir(cadeia));

        scan.close();
    }

    static int Dir(String cadeia){
        int toReturn = 0;
        int quantidadeAlfabeto = 0;
        int quantidadeNumerico = 0;

        for(int contador = 0; contador < cadeia.length(); contador++){
            boolean encontrou = false;
            for(int contador2 = 0; contador2 < numerico.length; contador2++){
                if (cadeia.charAt(contador) == alfabeto[contador2]) {
                    encontrou = true;
                    quantidadeAlfabeto++;
                }

                if (cadeia.charAt(contador) == numerico[contador2]) {
                    encontrou = true;
                    quantidadeNumerico++;
                }
            }

            if (!encontrou){
                toReturn = -1;
            }else if(quantidadeNumerico >= quantidadeAlfabeto){
                toReturn = 0;
            }else{
                toReturn = 1;
            }
        }

        return toReturn;
    }
}
