public class q7 {
    
    public static void main(String[] args){
        imprimirPalindromos(1000, 10000);
    }

    static void imprimirPalindromos(int rangemin, int rangemax){
        for (int contador = rangemin; contador <= rangemax; contador++){
            if (ePalindromo(contador)){
                System.out.println(contador);
            }
        }
    }

    static boolean ePalindromo(Integer numero){
        boolean palindromo = true;
        String numeroString = numero.toString();

        for (int contador = 0; contador < numero.toString().length(); contador++){
            if (numeroString.charAt(contador) != numeroString.charAt(numeroString.length() - contador -1)) {
                palindromo = false;    
            }
        }

        return palindromo;
    }
}
