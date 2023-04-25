import java.util.Scanner;

public class q23{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a sequencia: ");
        String sequencia = scan.next();

        if (sequenciaBinaria(sequencia)){
            System.out.println("É Binário! ");
        }else{
            System.out.println("Não é Binário! ");
        }

        scan.close();
    }

    static boolean sequenciaBinaria(String sequencia){
        for (int contador = 0; contador < sequencia.length(); contador++){
            if (sequencia.charAt(contador) != '0' && sequencia.charAt(contador) != '1'){
                return false;
            }
        }

        return sequencia.length() == 8;
    }
}
