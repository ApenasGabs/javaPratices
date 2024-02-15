package module12;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		boolean isTheTypedValueOnVector = false;
		Scanner inputValue = new Scanner(System.in);
		ArrayList<Integer> numbersList = new ArrayList<Integer>();
		numbersList.add(2);
		numbersList.add(5);
		numbersList.add(1);
		numbersList.add(3);
		numbersList.add(4);
		numbersList.add(9);
		numbersList.add(7);
		numbersList.add(8);
		numbersList.add(10);
		numbersList.add(6);
		System.out.println("Digite o número que você deseja encontrar: ");
		int typedValue = inputValue.nextInt();
		inputValue.close();

		if (numbersList.contains(typedValue)) {
			isTheTypedValueOnVector = true;
			System.out.println("O número " + typedValue + " está localizado na posição: " + numbersList.indexOf(typedValue));

		}

		if (!isTheTypedValueOnVector) {
			System.out.println("O número " + typedValue + " não foi encontrado!");

		}

	}
}
