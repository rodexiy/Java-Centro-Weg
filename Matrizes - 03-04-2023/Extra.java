import java.util.Scanner;


public class Extra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o número de funcionários");
        int numDeFuncionarios = scan.nextInt();
        Double somaSalarioBruto = 0.0, somaINSS = 0.0, somaImpostoDeRenda = 0.0, somaSalarioLiquido = 0.0;

        if (numDeFuncionarios <= 0) {
            System.out.println("Número inválido!");
            scan.close();
            return;
        }

        double[][] dados = new double[numDeFuncionarios][4];
        String[] nomes = new String[numDeFuncionarios];

        //0 - Salario Bruto
        //1 - INSS
        //2 - Imposto de renda
        //3 - Salario Liquido

        for(int funcionario = 0; funcionario < numDeFuncionarios; funcionario++) {
            System.out.println("Insira o nome do funcionário: ");
            String nome = scan.next();
            nomes[funcionario] = nome;

            if (nome == null || nome.isEmpty()){
                System.out.println("Nome inválido!");
                continue;
            }

            System.out.println("Insira o salário bruto: ");
            double salarioBruto = scan.nextDouble();
            
            if (salarioBruto <= 465) {
                System.out.println("Salário inválido!");
                continue;
            }
            dados[funcionario][0] = salarioBruto;

            double porcentagemINSS = 0;

            if (salarioBruto <= 965.67){
                porcentagemINSS = 0.08;
            }else if(salarioBruto <= 1609.45){
                porcentagemINSS = 0.09;
            }else if(salarioBruto <= 3218.90) {
                porcentagemINSS = 0.11;
            }

            double descontoINSS = Math.max(salarioBruto * porcentagemINSS, 354.70);
            dados[funcionario][1] = descontoINSS;

            double porcentagemImpostoDeRenda = 0;
            if (salarioBruto <= 1434.00){
                porcentagemImpostoDeRenda = 0;
            }else if(salarioBruto <= 2150.00){
                porcentagemImpostoDeRenda = 0.075;
            }else if(salarioBruto <= 2886.00) {
                porcentagemImpostoDeRenda = 0.15;
            }else if(salarioBruto <= 3582.00){
                porcentagemImpostoDeRenda = 0.225;
            }else {
                porcentagemImpostoDeRenda = 0.275;
            }


            double descontoImpostoDeRenda = salarioBruto * porcentagemImpostoDeRenda;
            dados[funcionario][2] = descontoImpostoDeRenda;
            dados[funcionario][3] = salarioBruto - descontoINSS - descontoImpostoDeRenda;

            somaSalarioBruto += salarioBruto;
            somaINSS += descontoINSS;
            somaImpostoDeRenda += descontoImpostoDeRenda;
            somaSalarioLiquido += dados[funcionario][3];
        }

        for(int funcionario = 0; funcionario < numDeFuncionarios; funcionario++) {
            System.out.println("Nome do funcionário: "+ nomes[funcionario]);
            System.out.println("Salario Bruto: "+ dados[funcionario][0]);
            System.out.println("INSS: "+ dados[funcionario][1]);
            System.out.println("Imposto de Renda: "+ dados[funcionario][2]);
            System.out.println("Salario Liquido: "+ dados[funcionario][3]);
            System.out.println("-------------------------------------------");
        }
        
        System.out.println("Soma dos salarios bruto: "+ somaSalarioBruto);
        System.out.println("Soma dos INSS: "+ somaINSS);
        System.out.println("Soma dos impostos de renda: "+ somaImpostoDeRenda);
        System.out.println("Soma dos salarios liquido: "+ somaSalarioLiquido);

        scan.close();
    }
}
