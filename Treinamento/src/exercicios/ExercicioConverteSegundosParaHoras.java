package exercicios;

import java.util.Scanner;

public class ExercicioConverteSegundosParaHoras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int segundoTotal = retornaValorDigitado(scan);
		int horaTotal = calculaHora(segundoTotal);
		int minutoTotal = calculaMinuto(segundoTotal);
		int seguntos = calculaSegundo(segundoTotal);
		exibeHoraMinutoSegundo(horaTotal,minutoTotal,seguntos,segundoTotal);
		
	}
	
	static int retornaValorDigitado(Scanner scan) {
		System.out.println("Digite um valor em segundos para converter para Horas:");
		int segTotal = scan.nextInt();
		return segTotal;
	}
	
	static int calculaHora(int segTotal) {
		int horas = (int) segTotal / 3600;
		return horas;
	}
	
	static int calculaMinuto(int segTotal) {
		int resto = segTotal % 3600;
		int minutos = resto / 60;
		return minutos;
	}

	static int calculaSegundo(int segTotal) {
		int resto = segTotal % 3600;
		int segundos = resto % 60;
		return segundos;
	}
	
	static void exibeHoraMinutoSegundo(int horas, int minutos, int segundos, int segundosTotal) {
		System.out.println("Os " + segundosTotal + " segundos digitados, equivalem a " + horas + "h" + minutos + "min" + segundos + "seg.");
	}
}
