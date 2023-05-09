import java.util.Scanner;

public class q20{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        System.out.println("Insira um caractere: ");
        String caractere = scan.next();

        System.out.println(caractere +" -> "+ retornaMaiusculo(caractere));

        scan.close();
    }

    static String retornaMaiusculo(String caractere){
        return caractere.toUpperCase();
    }
}
