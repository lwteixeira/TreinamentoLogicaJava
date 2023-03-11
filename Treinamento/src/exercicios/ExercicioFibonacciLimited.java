package exercicios;

import java.util.Scanner;

public class ExercicioFibonacciLimited {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um número de sequencias");
		System.out.println("quer deseja imprimir de Fibonacci:");
		int qdtFibo = scan.nextInt();

		int n1 = 0;
		int n2 = 1;

		while(n1 <= qdtFibo) {
			if (n1 == 0) {
				System.out.print(n1);
				int n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
			} else {
				System.out.print(", " + n1);
				int n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
			}
		}
		System.out.print(".");

	}

}