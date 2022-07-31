import java.util.Scanner;

/*
 * Elabore um algoritmo que efetue a apresentação do valor 
 * da conversão em real (R$) de um valor lido em dólar (US$). 
 * O algoritmo deverá solicitar o valor da cotação do dólar 
 * e também a quantidade de dólares disponíveis com ousuário;
 */

public class DolarReal {

	public static void main(String[] args) {
		
		double real = 0;
		double cotacaoDolar;
		double quantidadeDolar;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor da cotação do dólar");
		cotacaoDolar = entrada.nextDouble();
		System.out.println("Quanto dólares o usuário tem");
		quantidadeDolar = entrada.nextDouble();
		
		real = quantidadeDolar * cotacaoDolar;
		System.out.println("Valor convertido em Real R$" + real);
		
		entrada.close();
	}

}
