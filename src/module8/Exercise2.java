package module8;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner inputValues = new Scanner(System.in);
		float firstValue, secondValue, thirdValue, fourthValue, finalMedia;
		System.out.println("Digite a primeira nota");
		firstValue = inputValues.nextFloat();
		System.out.println("Digite a segunda nota");
		secondValue = inputValues.nextFloat();
		System.out.println("Digite a terceira nota");
		thirdValue = inputValues.nextFloat();
		System.out.println("Digite a segunda nota");
		fourthValue = inputValues.nextFloat();

		finalMedia = (firstValue + secondValue + thirdValue + fourthValue) / 4;
		System.out.println(finalMedia);
		inputValues.close();
	}

}
