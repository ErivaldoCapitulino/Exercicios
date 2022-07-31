import java.util.Scanner;

/*
 * A Loja Mamão com Açúcar está vendendo seus produtos 
 * em 5(cinco)prestações sem juros. Faça um algoritmo que 
 * receba um valor de uma compra e mostre o valor das 
 * prestações;
 */
public class Prestacoes {

	public static void main(String[] args) {

		double compra;
		double prestacoes;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor da compra");
		compra = entrada.nextDouble();
		
		prestacoes = compra / 5;
		System.out.println("Valor das 5 prestações a ser pagas: R$"+prestacoes);
		
		entrada.close();
	}

}
