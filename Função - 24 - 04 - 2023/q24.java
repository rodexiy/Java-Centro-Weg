import java.util.Scanner;

public class q24{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a sequencia: ");
        String palindromo = scan.next();

        if (verificaPalindromo(palindromo)){
            System.out.println("É palindromo! ");
        }else{
            System.out.println("Não é palindromo! ");
        }
        
        scan.close();
    }

    static boolean verificaPalindromo(String palindromo){
        return new StringBuilder(palindromo).reverse().toString().equals(palindromo);
    }
}
