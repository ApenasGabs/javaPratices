package module10;

import java.util.Scanner;

public class Exercise3 {
	// Escreva um algoritmo em Java, que leia a idade de várias pessoas (números
	// inteiros), via teclado e mostre
	// na tela o total de pessoas cuja idade seja menor que 21 anos e o total de
	// pessoas cuja idade seja maior que 50 anos.
	// A leitura dos dados deve ser finalizada ao digitar uma idade negativa. Veja o
	// exemplo abaixo:

	public static void main(String[] args) {
		Scanner inputValues = new Scanner(System.in);
		int age, olderThan50, youngerThan21;
		olderThan50 = 0;
		youngerThan21 = 0;
		boolean isTheAgeValid = true;

		while (isTheAgeValid) {
			System.out.println("Digite uma idade: ");
			age = inputValues.nextInt();
			if (age < 0) {
				isTheAgeValid = false;
			}
			if (age < 21) {
				youngerThan21++;
			}
			if (age > 50) {
				olderThan50++;
			}
		}
		System.out.println("Total de pessoas menores de 21 anos: " + youngerThan21);
		System.out.println("\n" + "Total de pessoas maiores de 50 anos: " + olderThan50);
		inputValues.close();
	}

}
