import java.util.Scanner;

/*
 * O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do 
 * distribuidor e dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, 
 * e depois o percentual do distribuidor sobre o resultado). Supondo que o percentual do distribuidor 
 * seja de 28% e os impostos 45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe 
 * o custo ao consumidor do mesmo;
 */

public class Exercicio12 {

	public static void main(String[] args) {

		double custoFabrica;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o custo de fábrica: ");
		custoFabrica = entrada.nextDouble();
		
		final double PERCENTUAL_DISTRIBUIDOR = 0.28;
		final double PERCENTUAL_APLICADO = 0.45;
		double resultado;
		double custoConsumidor;

		resultado = custoFabrica + (PERCENTUAL_APLICADO * custoFabrica);
		custoConsumidor = resultado + (PERCENTUAL_DISTRIBUIDOR * resultado);
		System.out.println("Custo Final do carro: R$ " + custoConsumidor);
		
		entrada.close();
	}
}
