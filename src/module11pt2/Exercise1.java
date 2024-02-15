package module11pt2;
import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		Scanner inputValue = new Scanner(System.in);
		int[] vector = {2,5,1,3,4,9,7,8,10,6};
		boolean isTheTypedValueOnVector = false;
		System.out.println("Digite o número que você deseja encontrar: ");
		int typedValue = inputValue.nextInt();

		for(int i = 0; i< vector.length; i++){
			if (typedValue == vector[i]) {
				isTheTypedValueOnVector = true;
				System.out.println("O número " + typedValue + " está localizado na posição: "+ i);
				
				}
			}
			if (!isTheTypedValueOnVector) {
				System.out.println("O número " + typedValue + " não foi encontrado!");
			}
		inputValue.close();
	}

}
