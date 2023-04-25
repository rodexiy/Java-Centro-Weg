import java.util.Scanner;
public class q11{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira a temperatura em graus Fahrenheit: ");
        int F = scan.nextInt();
        double C = converter(F);

        System.out.println("Temperatura em graus Celcius: "+ C);

        scan.close();
    }

    static double converter(double F){
        return (5/9 * (F-32));
    }
}
