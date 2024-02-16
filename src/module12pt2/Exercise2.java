package module12pt2;

import java.util.Scanner;
import java.util.Stack;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner inputValues = new Scanner(System.in);
		Stack<String> libraryStack = new Stack<String>();
		int chosenOption;

		do {
			System.out.println("\n*******************************************************");
			System.out.println("1: Adicionar um novo livro na pilha.");
			System.out.println("2: Listar todos os livros da Pilha");
			System.out.println("3: Retirar um livro da pilha");
			System.out.println("0: Sair");
			System.out.println("\n*******************************************************");
			System.out.print("Entre com opção desejada: ");
			chosenOption = inputValues.nextInt();
			inputValues.nextLine();
			switch (chosenOption) {
				case 1:
					System.out.print("Digite o nome: ");
					String bookName = inputValues.nextLine();
					libraryStack.push(bookName);
					System.out.println("\nPilha: ");
					System.out.println(libraryStack);
					System.out.println("\nLivro Adicionado!");
					break;
				case 2:
					if (libraryStack.isEmpty()) {
						System.out.println("A Pilha está vazia!");
					} else {
						System.out.print("Lista de Livros na Pilha: \n");
						System.out.println(libraryStack);
					}
					break;
				case 3:
					if (libraryStack.isEmpty()) {
						System.out.println("A Pilha está vazia!");
					} else {
						libraryStack.pop();
						System.out.print("Pilha: ");
						System.out.println(libraryStack);
						System.out.print("\nUm Livro foi retirado da pilha!");

					}
					break;
				case 0:
					System.out.println("\nPrograma Finalizado!");
					break;
				default:
					System.out.println("Opção Inválida!");
			}
		} while (chosenOption != 0);
		inputValues.close();

	}

}
