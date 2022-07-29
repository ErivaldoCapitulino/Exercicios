import java.util.Scanner;

/*
 * Escreva um algoritmo para determinar o consumo 
 * médio de um automóvel sendo fornecida a distância 
 * total percorrida pelo automóvel e o total de 
 * combustível gasto;
 * 
 */
public class Consumo {

	public static void main(String[] args) {
		int distanciaTotal;
		int totalCombustivel;
		float distanciaMedia;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual foi a distancia pecorrida: ");
		distanciaTotal = entrada.nextInt();
		System.out.println("Quanto foi gasto de combustível? ");
		totalCombustivel = entrada.nextInt();
		
		distanciaMedia = distanciaTotal / totalCombustivel;
		System.out.println("Distância Média: " + distanciaMedia);
		entrada.close();
	}

}