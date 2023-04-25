import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class q2{

    static LocalDate agora = LocalDate.now();
    static int diasASomar;
    static DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy (EEEE)");
    static LocalDate dataNova;
	static String dataFormatada;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a quantidade de dias: ");
        diasASomar = scan.nextInt();

        somarData();
        formatarData();

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
