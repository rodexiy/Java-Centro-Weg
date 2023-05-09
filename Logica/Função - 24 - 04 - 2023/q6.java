import java.util.Scanner;

public class q6 {

static String[] arrayMeses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o número do mes: ");
        int numeroMes = scan.nextInt();

        String nomeDoMes = nomeMes(numeroMes);
        System.out.println("O mês correspondente ao número "+ numeroMes+ " é: "+ nomeDoMes);
        scan.close();
    }
    
    static String nomeMes(int numero){
        return arrayMeses[numero - 1];
    }
}
