import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int primeroNumero = scan.nextInt();
        System.out.println("Insira um número: ");
        int segundoNumero = scan.nextInt();

        boolean multiplo = eMultiplo(primeroNumero, segundoNumero);

        if (multiplo){
            System.out.println("O primeiro número é multiplo do segundo!");
        }else{
            System.out.println("O primeiro número não é multiplo do segundo!");
        }

        scan.close();
    }
    
    static boolean eMultiplo(int primeroNumero, int segundoNumero){
       boolean multiplo = false;
    
       for(int contador = 1; contador < primeroNumero; contador++){
        if (contador * segundoNumero == primeroNumero){
            multiplo = true;
            break;
        }
       }

       return multiplo;
    }
}
