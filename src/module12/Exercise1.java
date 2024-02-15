package module12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
// Escreva um programa Java para criar uma Collection ArrayList
// de Objetos da Classe String. O programa deverá solicitar ao 
// usuário, que ele digite via teclado 5 cores e deverá adicioná-las 
// individualmente no ArrayList. Em seguida, faça o que se pede:
// Mostre na tela todas as cores que foram adicionadas. 
// Mostre na tela todas as cores que foram adicionadas ordenadas em 
// ordem crescente.	
		Scanner inputValue =  new Scanner(System.in);
		ArrayList<String> colorsList = new ArrayList<String>();
		for(int i = 1; i <= 5; i++){
			System.out.println("Digite sei la o que de cor");
			colorsList.add(inputValue.nextLine());
		}
		inputValue.close();
		Iterator<String> iColorsList = colorsList.iterator();
		
		System.out.println("Listar todas as cores:\n");
		while (iColorsList.hasNext()) {
		System.out.println(iColorsList.next());
		}
		System.out.println("-------");
		Collections.sort(colorsList);
		Iterator<String> iOrderedColorsList = colorsList.iterator();
		while (iOrderedColorsList.hasNext()) {
			System.out.println(iOrderedColorsList.next());
			}
	}

}
