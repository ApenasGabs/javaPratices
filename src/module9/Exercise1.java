package module9;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner inputValues = new Scanner(System.in);
		int firstValue, secondValue, thirdValue;
		System.out.println("Digite o primeiro valor ");
		firstValue = inputValues.nextInt();
		System.out.println("Digite o segundo valor");
		secondValue = inputValues.nextInt();
		System.out.println("Digite o terceiro valor");
		thirdValue = inputValues.nextInt();

		if (firstValue + secondValue > thirdValue) {
			System.out.println("A Soma de A + B é Maior do que " + thirdValue);
		}
		if (firstValue + secondValue < thirdValue) {
			System.out.println("A Soma de A + B é menor do que " + thirdValue);
		}
		if (firstValue + secondValue == thirdValue) {
			System.out.println("A Soma de A + B é igual a: " + thirdValue);
		}
		inputValues.close();
	}

}
