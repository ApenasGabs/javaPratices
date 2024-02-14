package module11;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e 
		// mostre na tela quantos números são pares e quantos número são ímpares. 
		Scanner inputValues = new Scanner(System.in);
		int typedValue, oddNumbers = 0 , evenNumbers = 0;
		
		for(int i = 1; i<=10; i++){
			System.out.println("Digite o " + i +"º número" );
			typedValue = inputValues.nextInt();

			if (typedValue %2 == 0 ) {
				evenNumbers++;
			}
			else{
				oddNumbers++;
			}
			
		}
		inputValues.close();
		System.out.println("Total de números pares: " + evenNumbers);
		System.out.println("Total de números ímpares: "+ oddNumbers);
	}

}
