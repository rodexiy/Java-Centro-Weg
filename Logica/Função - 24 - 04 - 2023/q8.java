import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int numero = scan.nextInt();

        int posicao = firbonacci(numero);

        System.out.println("O número corresponde a: "+ posicao);
        scan.close();
    }

    static int firbonacci(int numero){
		int atual = 1, anterior = 0, aux;
		
		for (int num = 1; num <= numero; num++) {
			aux = atual;
			atual += anterior;
			anterior = aux;
		}

        return atual;
    }
    
}
