import java.util.Scanner;

public class sudoku {
    public static void main(String[] args) {
        int[][] Sudoku = new int[9][9];

        Scanner scan = new Scanner(System.in);
        int numeroDeJogadores = 0;
        System.out.println("Insira o número de jogadores: ");
        numeroDeJogadores = scan.nextInt();

        if (numeroDeJogadores <= 0) {
            System.out.println("Número de jogadores inválido!");
            scan.close();
        } else {

            String[] nomeDosJogadores = new String[numeroDeJogadores];
            boolean[] arrayGanhouPerdeu = new boolean[numeroDeJogadores];

            for (int jogador = 0; jogador < numeroDeJogadores; jogador++) {
                // Insere os nomes dos jogadores
                System.out.println("Insira o nome do jogador " + (jogador + 1) + ": ");
                nomeDosJogadores[jogador] = scan.next();
                arrayGanhouPerdeu[jogador] = true;

                // Insirir numeros na matriz
                for (int linha = 0; linha < Sudoku.length; linha++) {
                    for (int coluna = 0; coluna < Sudoku.length; coluna++) {
                        System.out.println("Insira o número da linha " + linha + " e coluna " + coluna + ": ");
                        Sudoku[linha][coluna] = scan.nextInt();

                        if (Sudoku[linha][coluna] > 9) {
                            Sudoku[linha][coluna] = 9;
                        } else if (Sudoku[linha][coluna] < 1) {
                            Sudoku[linha][coluna] = 1;
                        }
                    }
                }

                // Verificação linha e coluna
                for (int linha = 0; linha < Sudoku.length; linha++) {
                    for (int coluna = 0; coluna < Sudoku.length; coluna++) {

                        // Verifica coluna -------
                        for (int coluna2 = 0; coluna2 < Sudoku.length; coluna2++) {
                            if (coluna != coluna2) {
                                if (Sudoku[linha][coluna] == Sudoku[linha][coluna2]) {
                                    arrayGanhouPerdeu[jogador] = false;
                                }
                            }
                        }

                        // Verifica linha |||||||
                        for (int linha2 = 0; linha2 < Sudoku.length; linha2++) {
                            if (linha != linha2) {
                                if (Sudoku[linha][coluna] == Sudoku[linha2][coluna]) {
                                    arrayGanhouPerdeu[jogador] = false;
                                }
                            }
                        }
                    }
                }

                // Verificação 3x3

                for (int quadranteLinha = 0; quadranteLinha < Sudoku.length; quadranteLinha += 3) {
                    for (int quadranteColuna = 0; quadranteColuna < Sudoku.length; quadranteColuna += 3) {
                        int[] arrayNumerosQuadrantes = new int[9];
                        for (int linha2 = quadranteLinha; linha2 < quadranteLinha + 3; linha2++) {
                            for (int coluna2 = quadranteColuna; coluna2 < quadranteColuna + 3; coluna2++) {
                                arrayNumerosQuadrantes[Sudoku[linha2][coluna2] - 1] += 1;
                            }
                        }

                        // verifica se há mais de 1 valor igual no quadrante
                        for (int linha2 = 0; linha2 < Sudoku.length; linha2++) {
                            if (arrayNumerosQuadrantes[linha2] > 1) {
                                arrayGanhouPerdeu[jogador] = false;
                            }
                        }
                    }

                }

                // Mostrar ganhadores
                System.out.println(" ");
                if (jogador == 0) {
                    System.out.println("Número de jogadores: " + numeroDeJogadores);
                    System.out.println(" ");
                }
                System.out.println("Nome do " + (jogador + 1) + "º jogador: " + nomeDosJogadores[jogador]);
                System.out.println(" ");
                System.out.println("Sudoku " + (jogador + 1) + ": " + nomeDosJogadores[jogador]);
                if (arrayGanhouPerdeu[jogador] == true) {
                    System.out.println("SIM");
                } else {
                    System.out.println("NÃO");
                }

                // Tabela

                for (int linha = 0; linha < Sudoku.length; linha++) {
                    for (int coluna = 0; coluna < Sudoku.length; coluna++) {
                        if (coluna == 2 || coluna == 5) {
                            System.out.print("" + Sudoku[linha][coluna] + " | ");
                        } else {
                            System.out.print("" + Sudoku[linha][coluna] + " ");
                        }
                    }
                    if (linha == 2 || linha == 5) {
                        System.out.println("");
                        System.out.println("------|-------|------");
                    } else {
                        System.out.println("");
                    }
                }
                System.out.println(" ");
            }

            scan.close();
        }
    }
}