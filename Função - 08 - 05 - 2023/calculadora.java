import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.flush();
            
            System.out.println("Insira o valor de x: ");
            double x = scan.nextDouble();
            System.out.println("Insira o valor de y: ");
            double y = scan.nextDouble();

            System.out.println("Insira a operação que deseja fazer: ");
            System.out.println("[ + ] - Somar ");
            System.out.println("[ - ] - Subtrair ");
            System.out.println("[ * ] - Multiplicar ");
            System.out.println("[ / ] - Dividir ");
            String operacao = scan.next();

            double resultado = 0;
            boolean operacaoExecutada = true;
            switch (operacao) {
                case "+":
                    resultado = somar(x, y);
                    break;
                case "-":
                    resultado = subtrair(x, y);
                    break;
                case "/":
                    resultado = dividir(x, y);
                    break;
                case "*":
                    resultado = multiplicar(x, y);
                    break;
                default:
                    System.out.println("Operação inválida!");
                    operacaoExecutada = false;
            }

            if (operacaoExecutada) {
                System.out.println("O resultado da operação é: " + resultado);
            }

            System.out.println("Deseja continuar? (S/N): ");
            String desejaContinuar = scan.next();
            
            if (!desejaContinuar.equals("S")){
                continuar = false;
            }

        }
        scan.close();
    }

    static double somar(double x, double y) {
        return x + y;
    }

    static double subtrair(double x, double y) {
        return x - y;
    }

    static double multiplicar(double x, double y) {
        return x * y;
    }

    static double dividir(double x, double y) {
        return x / y;
    }
}