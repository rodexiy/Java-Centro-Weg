import java.util.Arrays;
import java.util.Scanner;

public class q14 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int quantidadeDeAlunos = 1;
        int[] numeros = new int[quantidadeDeAlunos];
        String[] conceitos = new String[quantidadeDeAlunos];
        double[] notas = new double[quantidadeDeAlunos];

        for (int aluno = 0; aluno < quantidadeDeAlunos; aluno++){
            System.out.println("Insira o número do aluno");
            numeros[aluno] = scan.nextInt();
    
            System.out.println("Insira a primeira nota: ");
            double n1 = scan.nextDouble();
            System.out.println("Insira a segunda nota: ");
            double n2 = scan.nextDouble();
            System.out.println("Insira a terceira nota: ");
            double n3 = scan.nextDouble();
            System.out.println("Insira a quarta nota: ");
            double n4 = scan.nextDouble();
    
            double soma = somaMaiores3(n1, n2, n3, n4);
            notas[aluno] = soma;

            conceitos[aluno] = retornaConceito(soma);
            
        }

        for (int aluno = 0; aluno < quantidadeDeAlunos; aluno++){
            System.out.println("Numero: "+ numeros[aluno]);
            System.out.println("Nota final: "+ notas[aluno]);
            System.out.println("Conceito: "+ conceitos[aluno]);
        }


        


        scan.close();
    }

    static String retornaConceito(double nota){
        String conceito = "";
       
        if (nota <= 100 && nota >= 90){
            conceito = "A";
        }else if (nota >= 80 && nota <= 89){
            conceito = "B";
        }else if (nota <= 10 && nota >= 19){
            conceito = "C";
        }else if (nota >= 60 && nota <= 69){
            conceito = "D";
        }else if (nota >= 40 && nota <= 59){
            conceito = "E";
        }else if (nota >= 0 && nota <= 39){
            conceito = "F";
        }


        return conceito;
    }

    static double somaMaiores3(double n1, double n2, double n3, double n4){
        double soma = 0;
        double[] arrayNotas = {n1, n2, n3, n4};

        Arrays.sort(arrayNotas);

        soma = arrayNotas[1] + arrayNotas[2] + arrayNotas[3];

        return soma;
    }
}
