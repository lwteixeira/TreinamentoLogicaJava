package exercicios;
import java.util.Scanner;

public class ExercicioCalculaDescontoProdutoConformeQuantidade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		String nomeProduto;
		double valorProduto;
		int qtdProduto;
		double resultCompra;
		double compraComDesconto;
		int porcDesc;
		
		System.out.println("Esse sistema valida se você receberá desconto em sua compra.");
		System.out.print("Por favor insira o nome do produto: ");
		nomeProduto = ler.next();
		System.out.print("Por favor insira o valor do produto: ");
		valorProduto = ler.nextDouble();
		System.out.print("Por favor insira a quantidade de produtos: ");
		qtdProduto = ler.nextInt();
		
		System.out.println("");
		System.out.println("Huuuum, estou calculando aguarde...");
		System.out.println("");
		
		if(qtdProduto <= 10) {
			porcDesc = 0;
			resultCompra = valorProduto * qtdProduto;
			compraComDesconto = resultCompra - ((resultCompra/100)*porcDesc);
			mensagens(porcDesc, nomeProduto, compraComDesconto, qtdProduto);

		}else if(qtdProduto > 10 && qtdProduto <= 20) {
			porcDesc = 10;
			resultCompra = valorProduto * qtdProduto;
			compraComDesconto = resultCompra - ((resultCompra/100)*porcDesc);
			mensagens(porcDesc, nomeProduto, compraComDesconto, qtdProduto);
		}else if(qtdProduto > 20 && qtdProduto <= 50) {
			porcDesc = 20;
			resultCompra = valorProduto * qtdProduto;
			compraComDesconto = resultCompra - ((resultCompra/100)*porcDesc);
			mensagens(porcDesc, nomeProduto, compraComDesconto, qtdProduto);
		}else {
			porcDesc = 25;
			resultCompra = valorProduto * qtdProduto;
			compraComDesconto = resultCompra - ((resultCompra/100)*porcDesc);
			mensagens(porcDesc, nomeProduto, compraComDesconto, qtdProduto);
		}
	}
	
	static void mensagens (int porcDesc, String nomeProd, double totalCompra, int qtdProd) {
		if(qtdProd <= 10) {
			System.out.println("Conseguimor calcular todas as compras...");
			System.out.println("");
			System.out.println("A compra do produto: " + nomeProd);
			System.out.println("Ficou no valor de R$" + totalCompra);
			System.out.println("Obrigado pela preferencia!");
		}else {
			System.out.println("Conseguimor calcular todas as compras...");
			System.out.println("");
			System.out.println("A compra do produto: " + nomeProd);
			System.out.println("Ficou no valor de R$" + totalCompra);
			System.out.println("Parabéns você recebeu "+ porcDesc + "% de desconto");
			System.out.println("Obrigado pela preferencia!");
		}
	}

}
