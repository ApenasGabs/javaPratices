package module8;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner inputValues = new Scanner(System.in);
		float grossSalary, nightShiftAllowance, overtime, deductions, netSalary;

		System.out.println("Qual teu salario bruto mesmo ?");
		grossSalary = inputValues.nextFloat();

		System.out.println("Quanto de hora extra ?");
		overtime = inputValues.nextFloat();

		System.out.println("e o adcional noturno?");
		nightShiftAllowance = inputValues.nextFloat();

		System.out.println("ta, e qual o desconto?");
		deductions = inputValues.nextFloat();

		netSalary = (overtime + grossSalary + nightShiftAllowance) - deductions;
		System.out.printf("voce ira receber %.2f de salario", netSalary);

		inputValues.close();
	}

}
