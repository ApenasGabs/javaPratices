package module10;

import java.util.Scanner;

public class Exercise1 {
	// Escreva um algoritmo em Java, que leia 2 números inteiros via teclado,
	// onde o primeiro número deve ser menor do que o segundo número. Caso
	// contrário,
	// deve ser exibida uma mensagem na tela informando
	// que o intervalo é inválido e sair do programa.
	// No intervalo informado, mostre na tela todes os números que são múltiplos
	// de 3 e 5. Veja os exemplos abaixo:

	public static void main(String[] args) {
		Scanner inputValues = new Scanner(System.in);
		int firstValue, secondValue;
		boolean invalidValue;

		System.out.println("Digite o primeiro número do intervalo: 10");
		firstValue = inputValues.nextInt();
		System.out.println("Digite o último número do intervalo: 100");
		secondValue = inputValues.nextInt();
		invalidValue = firstValue > secondValue;
		if (invalidValue) {
			System.out.println("Intervalo inválido!");
		}
		for (int i = firstValue; i < secondValue; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println(i + "é múltiplo de 3 e 5");
			}
		}
		inputValues.close();
	}
}
