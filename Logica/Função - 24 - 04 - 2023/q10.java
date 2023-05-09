import java.util.Scanner;
public class q10{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int sexo;
        double altura;

        System.out.println("Insira o sexo 1-Masculino 2-Feminino: ");
        sexo = scan.nextInt();

        System.out.println("Insira o altura em metros: ");
        altura = scan.nextDouble();

        double peso = pesoIdeal(sexo, altura);

        System.out.println("O peso ideal é: "+ peso);

        scan.close();
    }

    static double pesoIdeal(int sexo, double Alt){
        double peso;

        if (sexo == 1){
            peso = (72.7 * Alt) - 58;
        }else{
            peso = (62.1 * Alt) - 44.7;
        }
        
        return peso;
    }
}