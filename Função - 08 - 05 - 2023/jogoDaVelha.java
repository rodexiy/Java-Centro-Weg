import java.util.Random;
import java.util.Scanner;

public class jogoDaVelha {
    static String[][] tabuleiro = new String[3][3];
    static boolean continuar = true;
    static boolean contraBot = true;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (continuar) {


            boolean adicionado = false;
            System.out.println("Vez de jogador 1");
            do {
                imprimirTabuleiro();
                System.out.println("Insira a linha: ");
                int linha = scan.nextInt() - 1;
                System.out.println("Insira a coluna: ");
                int coluna = scan.nextInt() - 1;
                adicionado = adicionarCasa(linha, coluna, "X");

                if (!adicionado) {
                    System.out.println("Posição inválida! ");
                }
            } while (!adicionado);
            
            verificar();
            adicionado = false;

            if (!continuar){
                break;
            }

            System.out.println("Vez de jogador 2");
            do {
                if (!contraBot){
                    imprimirTabuleiro();
                    System.out.println("Insira a linha: ");
                    int linha = scan.nextInt() - 1;
                    System.out.println("Insira a coluna: ");
                    int coluna = scan.nextInt() - 1;
    
                    adicionado = adicionarCasa(linha, coluna, "O");
    
                    if (!adicionado) {
                        System.out.println("Posição inválida! ");
                    }
                }else{
                    adicionado = bot_escolherPosicao();
                }
            } while (!adicionado);
            verificar();

        }

        scan.close();
    }

    static boolean bot_escolherPosicao(){
        Random random = new Random();

        return adicionarCasa(random.nextInt(2), random.nextInt(2), "O");
    }

    static void imprimirTabuleiro() {
        for (int linha = 0; linha < tabuleiro.length; linha++) {
            for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
                String casaPosicao = tabuleiro[linha][coluna];

                if (casaPosicao != null) {
                    System.out.print(" " + casaPosicao + " ");
                } else {
                    System.out.print("   ");
                }

                if (coluna == 0 || coluna == 1){
                    System.out.print(" | ");
                }
            }
            System.out.println("");
            if (linha == 0 || linha == 1){
                System.out.println("----------------");
            }
        }
    }

    static boolean adicionarCasa(int linha, int coluna, String simbolo) {
        if (verificarPosicao(linha, coluna)) {
            tabuleiro[linha][coluna] = simbolo;

            return true;
        }

        return false;
    }

    static boolean verificarPosicao(int linha, int coluna) {
        return linha <= 2 && coluna <= 2 && linha >= 0 && coluna >= 0 && tabuleiro[linha][coluna] == null;
    }

    static void FinalizarJogo(String ganhador) {
        continuar = false;
        System.out.println("O ganhador é: " + ganhador);
        imprimirTabuleiro();
    }

    static void verificar() {
        verificarLinhas();
        verificarColunas();
        verificarDiagonalPrincipal();
        verificarDiagonalSecundaria();
    }

    static void verificarGanhador(int quantidadeX, int quantidadeO) {
        if (quantidadeX >= 3) {
            FinalizarJogo("Jogador 1");
        }

        if (quantidadeO >= 3) {
            FinalizarJogo("Jogador 2");
        }
    }

    static void verificarLinhas() {
        for (int linha = 0; linha < tabuleiro.length; linha++) {
            int quantidadeX = 0;
            int quantidadeO = 0;

            for (int coluna = 0; coluna < tabuleiro.length; coluna++) {

                if (tabuleiro[linha][coluna] == "X") {
                    quantidadeX++;
                } else if (tabuleiro[linha][coluna] == "O") {
                    quantidadeO++;
                }
            }

            verificarGanhador(quantidadeX, quantidadeO);
        }
    }

    static void verificarColunas() {
        for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
            int quantidadeX = 0;
            int quantidadeO = 0;

            for (int linha = 0; linha < tabuleiro.length; linha++) {
                if (tabuleiro[linha][coluna] == "X") {
                    quantidadeX++;
                } else if (tabuleiro[linha][coluna] == "O") {
                    quantidadeO++;
                }
            }


            verificarGanhador(quantidadeX, quantidadeO);
        }
    }

    static void verificarDiagonalPrincipal() {
        int quantidadeX = 0;
        int quantidadeO = 0;

        for (int linha = 0; linha < tabuleiro.length; linha++) {
            for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
                if (linha == coluna) {
                    if (tabuleiro[linha][coluna] == "X") {
                        quantidadeX++;
                    } else if (tabuleiro[linha][coluna] == "O") {
                        quantidadeO++;
                    }
                }
            }
        }

        verificarGanhador(quantidadeX, quantidadeO);
    }

    static void verificarDiagonalSecundaria() {
        int quantidadeX = 0;
        int quantidadeO = 0;

        for (int linha = 0; linha < tabuleiro.length; linha++) {
            for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
                if (coluna == tabuleiro.length - 1 - linha) {
                    if (tabuleiro[linha][coluna] == "X") {
                        quantidadeX++;
                    } else if (tabuleiro[linha][coluna] == "O") {
                        quantidadeO++;
                    }
                }
            }
        }

        verificarGanhador(quantidadeX, quantidadeO);
    }
}