import java.util.Scanner;
public class q2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o texto: ");
        String texto1 = scan.next();
        
        System.out.println("Insira o texto: ");
        String texto2 = scan.next();

        if (textoIgual(texto1, texto2)){
            System.out.println("Os textos são iguais");
        }else{
            System.out.println("Não são iguais");
        }

        scan.close();
    }

    static boolean textoIgual(String texto1, String texto2){
        if (texto1.length() != texto2.length()){
            return false;
        }

        boolean igual = true;
        for (int contador = 0; contador < texto1.length(); contador++) {
            if (texto1.charAt(contador) != texto2.charAt(contador)){
                igual = false;
            }
        }

        return igual;
    }
}