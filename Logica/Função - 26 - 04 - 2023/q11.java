import java.util.Scanner;

public class q11 {
    

    public static String encriptar(int chave, String texto) {
        StringBuilder textoCifrado = new StringBuilder();
        int tamanhoTexto = texto.length();
    
        for (int c = 0; c < tamanhoTexto; c++) {
            int letraCifradaASCII = ((int) texto.charAt(c)) + (chave - 1);

    
            while (letraCifradaASCII > 126) {
                letraCifradaASCII -= 94;
            }
    
            textoCifrado.append((char) letraCifradaASCII);
        }
    
        return textoCifrado.toString();
    }

    public static String decriptar(int chave, String textoCifrado) {
        StringBuilder texto = new StringBuilder();
        int tamanhoTexto = textoCifrado.length();
    
        for (int c = 0; c < tamanhoTexto; c++) {
            int letraDecifradaASCII = ((int) textoCifrado.charAt(c)) - (chave - 1);
    
            while (letraDecifradaASCII < 32) {
                letraDecifradaASCII += 94;
            }
    
            texto.append((char) letraDecifradaASCII);
        }
    
        return texto.toString();
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a chave: ");
        int chave = scan.nextInt();
        System.out.println("Insira a palavra para encriptar");
        String palavra = scan.next();

        String palavraEncriptada = encriptar(chave, palavra);
        String palavraDesencriptada = decriptar(chave, palavraEncriptada);

        System.out.println("Palavra encriptada: "+ palavraEncriptada);
        System.out.println("Palavra desencriptada: "+ palavraDesencriptada);

        scan.close();
    }
}
