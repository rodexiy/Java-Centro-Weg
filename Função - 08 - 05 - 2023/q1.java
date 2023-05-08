import java.util.Scanner;

public class q1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        boolean continuar = true;
    
        while (continuar) {
            System.out.println("Insira o horário (HH:MM): ");
            String horario = scan.next();
    
            System.out.println("O horário é: "+ converter(horario));
            
            System.out.println("Deseja continuar? (S/N): ");
            String desejaContinuar = scan.next();
            
            if (!desejaContinuar.equals("S")){
                continuar = false;
            }
        }


        scan.close();
    }    

    static String converter(String horario){
        String[] split = horario.split(":");
        Integer horas = Integer.parseInt(split[0]);
        String indicador = "P.M.";
    
        if (horas > 12){
            horas -= 12;
        }else if(horas != 12){
            indicador = "A.M.";
        }

        if (horas <= 0){
            horas = 12;
        }
    
        return  horas.toString() + ":" + split[1] + " " + indicador;
    }
    
}
