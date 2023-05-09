

import java.util.Scanner;  

public class q6 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a data: dd/mm/yyyy");
        String data = scan.next();
        
        System.out.println(formatarMes(data));

        scan.close();
    }
    
    static String formatarMes(String data){
        return data.split("/")[0] + " de "+ pegarMes(data)+ " de " + data.split("/")[2]; 
    }

    static String pegarMes(String data){
        String[] tabelaMes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return tabelaMes[Integer.parseInt(data.split("/")[1]) - 1]; 
    }
}   


