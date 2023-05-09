import java.util.Scanner;

public class q10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira sua altura em metros (1,70): ");
        double altura = scan.nextDouble();
        System.out.println("Insira seu peso em kg (60kg): ");
        double peso = scan.nextDouble();

        double imc = calcularIMC(peso, altura);
        System.out.println("O seu imc é: "+ imc);

        String interpretacao = retornaInterpretacao(imc);
        System.out.println("A interpretação do seu IMC é: "+ interpretacao);

        scan.close();
    }

    static double calcularIMC(double PC, double alt){
        return PC / (alt * alt);
    }

    static String retornaInterpretacao(double IMC){
        String interpretacao = "";

        if (IMC < 20){
            interpretacao = "Magro";
        }else if(IMC <= 24){
            interpretacao = "Normal";
        }else if (IMC <= 29){
            interpretacao = "Acima do peso";
        }else if(IMC <= 34){
            interpretacao = "Obeso";
        }else if(IMC > 34){
            interpretacao = "Muito obeso";
        }


        return interpretacao;
    }
}
