import java.util.Scanner;

public class q1{

    static double valor;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int escolha;
        System.out.println("Insira o valor em reais: ");
        valor = scan.nextInt();

        System.out.println("Insira o para qual deseja converter: ");
        System.out.println("1 - Dolares");
        System.out.println("2 - Ienes");
        escolha = scan.nextInt();
        switch(escolha){
            case 1:
                converterDolares();
                System.out.println("Valor em Dolares: "+ valor );
                break;
            case 2:
                converterIenes();
                System.out.println("Valor em Ienes: "+ valor );
                break;

            default: 
                System.out.println("Opção incorreta!");
        }

        scan.close();
    }

    static void converterDolares(){
        valor = valor/0.30;
    }

    static void converterIenes(){
        valor = valor * 30;
    }

}