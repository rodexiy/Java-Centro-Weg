import java.util.Scanner;

public class q21{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        System.out.println("Insira um caractere: ");
        String caractere = scan.next();
        
        System.out.println(caractere +" -> "+ retornaMinusculo(caractere));

        scan.close();
    }

    static String retornaMinusculo(String caractere){
        return caractere.toLowerCase();
    }
}
