import java.util.Scanner;

public class q15 {

	public static void main(String[] args) {

		int[] dezenasSorteadas = new int[6];
		int numAposta, qtdDezenas, temo = 0, quadra = 0, quina = 0, sena = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < dezenasSorteadas.length; i++) {
			System.out.print("Digite a " + (i + 1) + "ª dezena sorteada: ");
			dezenasSorteadas[i] = sc.nextInt();
		}

		do {
			int pontos = 0;

			System.out.print("Digite o número da aposta: ");
			numAposta = sc.nextInt();

			if (numAposta == 0) {
				break;
			}

			System.out.print("Digite a quantidade de dezenas a apostar: ");
			qtdDezenas = sc.nextInt();

			int[] dezenasEscolhidas = new int[qtdDezenas];

			for (int i = 0; i < qtdDezenas; i++) {
				System.out.print("Digite a " + (i + 1) + "ª dezena: ");
				dezenasEscolhidas[i] = sc.nextInt();
			}

			pontos = checarAposta(dezenasSorteadas, dezenasEscolhidas);
			System.out.println("Pontos do apostador: " + pontos);
			if (pontos == 3) {
				System.out.println("Fez o temo!");
				temo++;
			} else if (pontos == 4) {
				System.out.println("Fez a quadra!");
				quadra++;
			} else if (pontos == 5) {
				System.out.println("Fez a quina!");
				temo++;
			} else if (pontos == 6) {
				System.out.println("Mega-Sena!");
				sena++;
			}

		} while (numAposta > 0);
		
		System.out.println("Quantidade de temos: " + temo);
		System.out.println("Quantidade de quadras: " + quadra);
		System.out.println("Quantidade de quinas: " + quina);
		System.out.println("Quantidade de senas: " + sena);

		sc.close();

	}

	static int checarAposta(int[] dezenasSorteadas, int[] dezenasEscolhidas) {
		int numCorretos = 0;

		for (int i = 0; i < dezenasSorteadas.length; i++) {
			for (int j = i; j < dezenasEscolhidas.length; j++) {
				if (dezenasSorteadas[i] == dezenasEscolhidas[j]) {
					numCorretos++;
				}
			}
		}
		return numCorretos;

	}

}