import java.util.Random;

public class m3 {
    public static void main(String[] args) {
        Random random = new Random();
        double[] temperaturas = new double[121];
        double media = 0;

        for (int contador = 0; contador < temperaturas.length; contador++) {
            temperaturas[contador] = random.nextInt((40 - 15) + 1) + 15;
            media += temperaturas[contador];
        }

        double temperaturaAux;
        for (int contador1 = 0; contador1 < temperaturas.length; contador1++) {
            for (int contador2 = 1; contador2 < contador1; contador2++) {
                if (temperaturas[contador1] > temperaturas[contador2] ) {
                   temperaturaAux = temperaturas[contador1];
                   temperaturas[contador1] = temperaturas[contador2];
                   temperaturas[contador2] = temperaturaAux;
                }
            }
        }



        System.out.println("Menor temperatura: "+ temperaturas[temperaturas.length - 1]);
        System.out.println("Maior temperatura: "+ temperaturas[0]);
        System.out.println("Temperatura média: "+ (media / (temperaturas.length - 1)));
    }
}
