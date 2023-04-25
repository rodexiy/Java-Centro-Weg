import java.time.LocalDate;
import java.util.Scanner;
import java.util.Locale;
import java.time.format.DateTimeFormatter;

public class q3{

    static LocalDate agora = LocalDate.now();
    static int diasASomar;
    static DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy (EEEE)");
    static LocalDate dataNova;
	static String dataFormatada;
    static Locale local;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a quantidade de dias: ");
        diasASomar = scan.nextInt();
        int opcaoLocal;

        somarData();

        System.out.println("Você quer formatar em que linguagem: \n1 - Português \n2 - Inglês \n3 - Francês \n4 - Espanhol \n-> ");
		opcaoLocal = scan.nextInt();

        formatarData();
		switch (opcaoLocal) {
            case 1:
                local = new Locale("pt", "BR");
                break;
            case 2:
                local = new Locale("en", "US");
                break;
            case 3:
                local = new Locale("fr", "FR");
                break;
            case 4:
                local = new Locale("es", "ES");
                break;
            default:
                System.out.println("Opção inválida!");
            }

            if (opcaoLocal == 2) {
                formato = DateTimeFormatter.ofPattern("MM/dd/yyyy (EEEE)", local);
            } else {
                formato = DateTimeFormatter.ofPattern("dd/MM/yyyy (EEEE)", local);			
            }

            System.out.println("Daqui a " + diasASomar + " dias será: " + dataFormatada);	

        scan.close();
    }

    static void somarData(){
        dataNova = agora.plusDays(diasASomar);
    }

    static void formatarData(){
        dataFormatada = dataNova.format(formato);
    }
}
