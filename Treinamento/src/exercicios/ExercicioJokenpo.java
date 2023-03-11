package exercicios;

import java.util.Random;
import java.util.Scanner;

public class ExercicioJokenpo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		Random random = new Random();
		
		int userEscolha;
		int iaEscoha;
		
		System.out.println("Bora jogar um JOKENPO!!!");
		System.out.println("Digite os seguinte números para escolher sua opção...");
		System.out.println("0 - Papel");
		System.out.println("1 - Pedra");
		System.out.println("2 - Tesousa");
		userEscolha = ler.nextInt();
		iaEscoha = random.nextInt(3);
		System.out.println("-'-'-'-'-'-'-'-'-'-'-");
		System.out.println("JO....KEN...POOO....");
		System.out.println("-'-'-'-'-'-'-'-'-'-'-");
		
		if(userEscolha == 0) {
			if(iaEscoha == 1) {
				System.out.println("Uhuuull... Você VENCEU!!!");
			}else if(iaEscoha == 2) {
				System.out.println("Oohh ;( Você PERDEU!!");
			}else {
				System.out.println("Tente denovo, Você EMPATOU!!");
			}
		}else if(userEscolha == 1) {
			if(iaEscoha == 1) {
				System.out.println("Tente denovo, Você EMPATOU!!");
			}else if(iaEscoha == 2) {
				System.out.println("Uhuuull... Você VENCEU!!!");
			}else {
				System.out.println("Oohh ;( Você PERDEU!!");
			}
		}else if(userEscolha == 2) {
			if(iaEscoha == 1) {
				System.out.println("Oohh ;( Você PERDEU!!");
			}else if(iaEscoha == 2) {
				System.out.println("Tente denovo, Você EMPATOU!!");
			}else {
				System.out.println("Uhuuull... Você VENCEU!!!");
			}
		}
		
	}

}
