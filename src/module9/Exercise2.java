package module9;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
 		 Scanner inputValues = new Scanner(System.in);
		 int typedValue;
		 typedValue = inputValues.nextInt();
		 System.out.println("Digite um numero inteiro");
		 boolean isOddNumber = typedValue%2 != 0;
		 boolean isNegativeNumber = typedValue < 0;
		 if (!isOddNumber && !isNegativeNumber ) {
			System.out.println("O Número 2 é par e positivo!");
		 }
		 if (isOddNumber && isNegativeNumber) {
			System.out.println("O Número -3 é ímpar e negativo!");
		 }
		 if (!isOddNumber && isNegativeNumber) {
			System.out.println("O Número -2 é par e negativo!");
		 }
		 if (isOddNumber && !isNegativeNumber) {
			System.out.println(" O Número 3 é ímpar e positivo!");
		 }
	}

}
