import java.util.Scanner;

/*
 * Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;
 */

public class Exercicio15 {

	public static void main(String[] args) {
		
		int numero;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um número: ");
		numero = entrada.nextInt();
		
		if(numero >= 100 && numero <= 200) {
			System.out.println("O número " + numero + " se encontra no intervalo entre 100 e 200");
		}
		System.out.println("FIM");
		entrada.close();
	}

}
