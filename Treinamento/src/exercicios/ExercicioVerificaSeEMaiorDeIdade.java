package exercicios;

import java.util.Scanner;

public class ExercicioVerificaSeEMaiorDeIdade {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in)) {
			System.out.println("Esse programa valida se você é maior de idade ou não!");
			System.out.print("Por favor informe qual a sua idade: ");
			
			int idade = ler.nextInt();
			
			if(idade >= 18) {
				System.out.println("Parabéns você já é maior de idade.\nEntão já pode fazer carteira de motorista.");
			}else if(idade < 18 && idade > 0){
				System.out.println("Oh não, você deve esperar " + (18 - idade) + " ano(s) ainda para fazer a carteira de motorista.");
			}else {
				System.out.println("Idade inválida, favor informar a idade corretamente.");
			}
		}
			
	}

}
