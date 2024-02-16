package module12pt2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner inputValues = new Scanner(System.in);
		Queue<String> clientsQueue = new LinkedList<String>();
		int chosenOption;
		do {
			System.out.println("\n*******************************************************");
			System.out.println("1: Adicionar um novo Cliente na fila");
			System.out.println("2: Listar todos os Clientes na fila");
			System.out.println("3: Chamar (retirar) uma pessoa da fila");
			System.out.println("0: Sair");
			System.out.println("\n*******************************************************");
			System.out.print("Entre com opção desejada: ");
			chosenOption = inputValues.nextInt();
			inputValues.nextLine();
			switch (chosenOption) {
				case 1:
					System.out.print("Digite o nome: ");
					String name = inputValues.nextLine();
					clientsQueue.add(name);
					System.out.println("\nFila: ");
					System.out.println(clientsQueue);
					System.out.println("\nCliente Adicionado!");
					break;
				case 2:
					if (clientsQueue.isEmpty()) {
						System.out.println("A Fila está vazia!");
					} else {
						System.out.println("Lista de Clientes na Fila: ");
						for (String client : clientsQueue) {
							System.out.println(client);
						}
					}
					break;
				case 3:
					if (clientsQueue.isEmpty()) {
						System.out.println("A Fila está vazia!");
					} else {
						System.out.println("Fila: ");
						clientsQueue.poll();
						System.out.println(clientsQueue);
						System.out.println("\nO Cliente foi Chamado!");
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
