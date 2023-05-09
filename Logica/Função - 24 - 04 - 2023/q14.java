import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class q14{
    static String[] chars = {
        "a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
        "t", "u", "v", "w", "x", "y", "z",
    };
    static List<String> caracteres = new ArrayList<>(Arrays.asList(chars));

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        System.out.println("Insira um caractere: ");
        String caractere = scan.next();

        if (verificaAlfabeto(caractere)) {
            System.out.println("É um caractere!");
        }else{
            System.out.println("Não é um caractere!");
        }

        scan.close();
    }

    static boolean verificaAlfabeto(String caractere){
        return caracteres.contains(caractere.toLowerCase());
    }
}
