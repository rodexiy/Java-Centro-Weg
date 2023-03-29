import java.util.ArrayList;
import java.util.Scanner;

;

public class m4v2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        
        boolean rodando = true;
        ArrayList<String> listaNomes = new ArrayList<>();

        int numeroInserido;

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
                    System.out.println("Insira o nome: ");
                    listaNomes.add(scan.next());
                    break;
                case 2:
                System.out.println("Insira o nome que deseja pesquisar: ");
                String nomeParaPesquisar = scan.next();
                boolean found = false;
                for (int contador = 0; contador < listaNomes.size(); contador++) {
                    if (listaNomes.get(contador).equals(nomeParaPesquisar)) {
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
                    for (int contador = 0; contador < listaNomes.size(); contador++) {
                        System.out.println("["+ contador+"] "+ listaNomes.get(1));
                    }
                    System.out.println("--------------------");
                    break;

                 case 4:
                    rodando = false;
                    break;

            }
        }
        
        scan.close();
    }
}
