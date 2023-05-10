import java.util.Scanner;

public class q2 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double nota1, nota2, nota3;
        String tipoDeMedia;


        System.out.println("Insira a primeira nota: ");
        nota1 = scan.nextDouble();

        System.out.println("Insira a segunda nota: ");
        nota2 = scan.nextDouble();

        System.out.println("Insira a terceira nota: ");
        nota3 = scan.nextDouble();

        System.out.println("Insira o tipo de média: ");
        tipoDeMedia = scan.next();


        System.out.println("A média é: "+ calcularMedia(nota1, nota2, nota3, tipoDeMedia));
        scan.close();
    }

    static double calcularMedia(double nota1, double nota2, double nota3, String tipoDeMedia){
        double media = 0;

        switch (tipoDeMedia){
            case "A":
                media = (nota1 + nota2 + nota3) / 3;
                break;
            case "P":
                int peso1 = 5, peso2 = 3, peso3 = 2;
                media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / peso1 + peso2 + peso3;
                break;
            case "H":
                media = 3 / ((1 / nota1) + (1 / nota2) + (1 / nota3));
        }

        return media;
    }
}
