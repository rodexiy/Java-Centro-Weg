import java.util.Scanner;
public class q1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String texto = scan.next();

        if (textoEMinusculo(texto)) {
            System.out.println("O texto é igual");
        }else {
            System.out.println("O texto não é igual");
        }

        scan.close();
    }

    static boolean textoEMinusculo(String texto){
        return (texto == texto.toLowerCase());
    }
}