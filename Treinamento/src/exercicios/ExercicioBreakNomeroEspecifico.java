package exercicios;
import java.util.Scanner;

public class ExercicioBreakNomeroEspecifico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int numUser;
		
		do {
			System.out.println("Digite o número correto para fechar o programa:");
			numUser = scan.nextInt();
			if(numUser != 10)
				System.out.println("Errou! Tente outro número...");
		} while (numUser != 10);
		System.out.println("Parabens você acertou!");
	}

}
