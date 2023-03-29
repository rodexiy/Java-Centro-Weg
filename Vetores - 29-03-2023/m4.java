import java.util.Scanner;

public class m4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o número de casas do vetor");
        int numeroDeCasas = scan.nextInt();
        
        boolean rodando = true;

        String[] listaNomes = new String[numeroDeCasas];
        int numeroInserido;
        int nomeAtual = 0;

        
        while (rodando == true) {
            System.out.flush();
            System.out.println("[1] Cadastrar nome");
            System.out.println("[2] Pesquisar nome");
            System.out.println("[3] Listar todos os nomes");
            System.out.println("[4] Sair do programa");

            System.out.println("--------");
            System.out.println("Digite sua escolha: ");
            numeroInserido = scan.nextInt();

            switch(numeroInserido) {
                case 1:
                    if (nomeAtual < listaNomes.length) {
                        System.out.println("Insira o nome: ");
                        listaNomes[nomeAtual] = scan.next();
                        nomeAtual++;
                    }else{
                        System.out.println("Limite do banco de dados!");
                    }

                    break;
                case 2:
                    System.out.println("Insira o nome que deseja pesquisar: ");
                    String nomeParaPesquisar = scan.next();
                    boolean found = false;
                    for (int contador = 0; contador < listaNomes.length; contador++) {
                        if (listaNomes[contador].equals(nomeParaPesquisar)) {
                            System.out.println("O nome existe no banco de dados!");
                            found = true;
                            break;
                        }
                    }
                    
                    if (found == false) {
                        System.out.println("O nome não existe no banco de dados!");
                    }else{
                        found = false;
                    }

                    break;
                case 3:
                    for (int contador = 0; contador < listaNomes.length; contador++) {
                        System.out.println("["+ contador+"]"+ listaNomes[contador]);
                    }
                    break;

                 case 4:
                    rodando = false;

            }
        }
        
        scan.close();
    }
}
