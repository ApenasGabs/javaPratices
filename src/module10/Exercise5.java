package module10;

import java.util.Scanner;

public class Exercise5 {
  // Escreva um algoritmo em Java, que leia números inteiros via teclado, até que
  // o número zero seja digitado.
  // Ao final, mostre na tela a soma de todos os números digitados, que sejam
  // positivos. Veja o exemplo abaixo:
  public static void main(String[] args) {
    Scanner inputValues = new Scanner(System.in);
    int typedNumber, sumOfPositiveNumbers = 0;
    typedNumber = inputValues.nextInt();

    boolean isTheNumberValid = typedNumber != 0;
    do {
      System.out.println("Digite um número: ");
      if (typedNumber % 2 == 0) {
        sumOfPositiveNumbers = +typedNumber;
        System.out.println("A soma dos números positivos é: " + sumOfPositiveNumbers);
      }
    } while (isTheNumberValid);
    inputValues.close();
  }
}
