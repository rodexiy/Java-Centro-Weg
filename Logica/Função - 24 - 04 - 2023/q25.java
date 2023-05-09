import java.util.Scanner;

public class q25{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        System.out.println("Insira um caractere: ");
        String frase = scan.next();
        
        if (saoTodosMaiusculos(frase)) {
            System.out.println("Todos são maiusculos");
        }else{
            System.out.println("Nem todos são maiusculos");
        }

        scan.close();
    }

    static boolean saoTodosMaiusculos(String frase){
        return frase.toUpperCase().equals(frase) ;
    }
}
