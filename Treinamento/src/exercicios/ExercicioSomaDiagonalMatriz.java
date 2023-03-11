package exercicios;

public class ExercicioSomaDiagonalMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};

		int soma = 0;
		int coluna = 0;
		int soma2 = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(i == j) {
					soma = soma + matriz[i][j];
				}
			}
		}
		System.out.println(soma);
		
		for (int i = 0; i < matriz.length; i++) {
			soma2 = soma2 + matriz[i][coluna];
			coluna++;
		}
		System.out.println(soma2);
	}

}
