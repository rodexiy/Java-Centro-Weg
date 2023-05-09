import java.util.Scanner;

public class q2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double valorPrestacao;
        int diasDeAtraso;
        int quantidadeDePrestacoes = 0;
        int valorTotalPago = 0;

        while (true) {
            System.out.println("Insira o valor da prestação: ");
            valorPrestacao = scan.nextInt();

            if (valorPrestacao <= 0){
                break;
            }

            System.out.println("Insira o número de dias de atraso: ");
            diasDeAtraso = scan.nextInt();
    
            double valorAPagar = valorPagamento(valorPrestacao, diasDeAtraso);
            
            valorTotalPago += valorAPagar;
            quantidadeDePrestacoes++;

            System.out.println("Final: "+ valorAPagar);
        }

        System.out.println("Total de prestações: "+ quantidadeDePrestacoes);
        System.out.println("Valor pago no dia: "+ valorTotalPago);
        
        scan.close();
    }

    static double valorPagamento(double valorPrestacao, int diasDeAtraso){
        double valorAPagar = valorPrestacao;

        if (diasDeAtraso > 0){
            valorAPagar = valorPrestacao * 1.03;

            for (int dia = 1; dia <= diasDeAtraso; dia++){
                valorAPagar *= 1.001 ;
            }
        }

        

        return valorAPagar;
    }
}
