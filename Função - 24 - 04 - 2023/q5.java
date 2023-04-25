import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int ano = scan.nextInt();

        boolean bissexto = eBissexto(ano);

        if (bissexto){
            System.out.println("O ano é bissexto!");
        }else{
            System.out.println("O ano não é bissexto!");
        }

        scan.close();
    }
    
    static boolean eBissexto(int ano){
        return (ano % 4 == 0);
    }
}
