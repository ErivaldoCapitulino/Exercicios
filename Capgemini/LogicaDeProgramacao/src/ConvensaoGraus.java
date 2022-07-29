import java.util.Scanner;

/*
 * Leia uma temperatura em graus Celsius e apresentá-la 
 * convertida em graus Fahrenheit. Afórmula de conversão 
 * é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e 
 * C a temperatura emCelsius;
 */

public class ConvensaoGraus {

	public static void main(String[] args) {

		double celsius;
		double fahrenheit; 
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe uma temperatura em graus Celsius");
		celsius = entrada.nextDouble();
		fahrenheit = ((9 * celsius) + 160) / 5;
		
		System.out.println("Temperatura convertida: FAHRENHEIT "+ fahrenheit);
		
		entrada.close();
	}

}
