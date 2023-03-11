package exercicios;

import java.util.Random;

public class ExercicioOrderVetorAndAgroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		int[] vet1 = new int[50];
		int[] vet2 = new int[50];
		int[] vetTotal = new int[100];
		int aux = 0;
		int aux1 = 0;
		
		for (int i = 0; i < 50; i++) {
			vet1[i] = rand.nextInt(1000);
			vet2[i] = rand.nextInt(1000);
		}
		
		for (int i = 0; i < vet1.length; i++) {
			for (int j = 0; j < vet1.length-1; j++) {
				if (vet1[j] > vet1[j+1]) {
					aux = vet1[j];
					vet1[j] = vet1[j+1];
					vet1[j+1] = aux;
				}
				if (vet2[j] > vet2[j+1]) {
					aux = vet2[j];
					vet2[j] = vet2[j+1];
					vet2[j+1] = aux;
				}
			}
		}
		
		while(aux1 < vetTotal.length) {
			if (aux1 < 50) {
				vetTotal[aux1] = vet1[aux1];
				aux1++;
			}else if(aux1 < 100){
				vetTotal[aux1] = vet2[aux1-50];
				aux1++;
			}
		};
		
		for (int i = 0; i < vetTotal.length; i++) {
			for (int j = 0; j < vetTotal.length-1; j++) {
				if (vetTotal[j] > vetTotal[j+1]) {
					aux = vetTotal[j];
					vetTotal[j] = vetTotal[j+1];
					vetTotal[j+1] = aux;
				}
			}
		}
		System.out.println("Vetor de 100 posições Ordenado!!");
		for (int i = 0; i < 100; i++) {
			System.out.println(vetTotal[i]);
		}

		
	}

}
