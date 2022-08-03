import java.util.Scanner;

/*
 * Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
 */

public class Exercicio14 {

	public static void main(String[] args) {

		int primeiroNumero;
		int segundoNumero;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número");
		primeiroNumero = entrada.nextInt();
		
		System.out.println("Informe o segundo número");
		segundoNumero = entrada.nextInt();
		
		if(segundoNumero == primeiroNumero) {
			System.out.println(primeiroNumero + " é igual ao segundo número " + segundoNumero);
		}
		else if(segundoNumero > primeiroNumero) {
			System.out.println(segundoNumero + " é maior do que o primeiro número " + primeiroNumero);
		}
		else {
			System.out.println(primeiroNumero + " é maior do que o segundo número " + segundoNumero);			
		}
		entrada.close();
	}

}
