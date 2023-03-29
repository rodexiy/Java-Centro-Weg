import java.util.Scanner;

public class m1{
    public static void main(String[] args) {
        double[] totalVendas = new double[10];
        String[] nomes = new String[10];
        int[] percentual = new int[10];
        double[] aReceber = new double[10];
        double totalDoTotal = 0;
        
        Scanner scan = new Scanner(System.in);
        for(int contador = 0; contador <= 9; contador++) {
            System.out.println("Insira o total de vendas");
            totalVendas[contador] = scan.nextDouble();

            totalDoTotal += totalVendas[contador];

            System.out.println("Insira o percentual: ");
            percentual[contador] = scan.nextInt();

            System.out.println("Insira o nome: ");
            nomes[contador] = scan.next();
        }

        for (int contador = 0; contador <= 9; contador++) {
            aReceber[contador] = (totalVendas[contador] * percentual[contador] / 100);
            System.out.println(nomes[contador] + ": "+ aReceber[contador]);
        }

        System.out.println("Total de vendas: "+ totalDoTotal);

        String strAux;
        Double dbAux;
        for (int contador1 = 0; contador1 <= 9; contador1++) {
            for (int contador2 = 1; contador2 < contador1; contador2++) {
                if (aReceber[contador1] > aReceber[contador2] ) {
                    dbAux = aReceber[contador1];
                    aReceber[contador1] = aReceber[contador2];
                    aReceber[contador2] = dbAux;

                    strAux = nomes[contador1];
                    nomes[contador1] = nomes[contador2];
                    nomes[contador2] = strAux;
                }
            }
        }

        System.out.println("Maior valor a receber: "+nomes[0] +" - "+ aReceber[0]);
        System.out.println("Menor valor a receber: "+nomes[9] +" - "+  aReceber[9]);


        scan.close();
    }
}