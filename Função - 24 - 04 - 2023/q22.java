import java.util.Scanner;

public class q22{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o nome: ");
        String nome = scan.nextLine();

        System.out.println("O sobrenome é: "+ retornaSobrenome(nome));

        scan.close();
    }

    static String retornaSobrenome(String nome){
        return nome.split(" ")[nome.split(" ").length - 1] ;
    }
}
