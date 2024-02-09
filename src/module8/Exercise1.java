package module8;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner inputValues = new Scanner(System.in);
		float salary, bonus, newSalary;
		System.out.println("Qual teu salario mesmo ?");
		salary = inputValues.nextFloat();
		System.out.println("mas e o bonus ?");
		bonus = inputValues.nextFloat();
		newSalary = salary + bonus;
		System.out.printf("Batata %.2f", newSalary);
		inputValues.close();

	}

}
