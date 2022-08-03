import java.util.Scanner;

/*
 * Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. 
 * Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado 
 * pelo usuário;
 */

public class Exercicio11 {

	public static void main(String[] args) {
		
		double precoCusto;
		double percentual;
		double precoVenda;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o preço de custo: ");
		precoCusto = entrada.nextDouble();
		
		System.out.println("Informe um percentual de acréscimo que recebera: ");
		percentual = entrada.nextDouble();
		
		precoVenda = precoCusto + (precoCusto * (percentual / 100));
		
		System.out.println("Preço de venda: R$" + precoVenda);
		
		
		entrada.close();
	}

}
