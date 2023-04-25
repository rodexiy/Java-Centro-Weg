import java.util.Scanner;
public class q9{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int sexo, idade;
        double peso, altura;

        System.out.println("Insira o sexo 1-Masculino 2-Feminino: ");
        sexo = scan.nextInt();

        System.out.println("Insira o peso em kg: ");
        peso = scan.nextDouble();

        System.out.println("Insira o altura em cm: ");
        altura = scan.nextDouble();

        System.out.println("Insira a idade: ");
        idade = scan.nextInt();

        double GEB = calcularGEB(sexo, peso, altura, idade);

        System.out.println("O GEB é: "+ GEB);

        scan.close();
    }

    static double calcularGEB(int sexo, double PC, double Alt, int I){
        double GEB;

        if (sexo == 1){
            GEB = 66.47 + (13.75 * PC) + (5 * Alt) - (6.76 * I);
        }else{
            GEB = 655.1 + (9.56 * PC) + (1.85 * Alt) - (4.67 * I);
        }
        
        return GEB;
    }
}