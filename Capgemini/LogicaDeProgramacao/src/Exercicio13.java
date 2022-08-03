import java.util.Scanner;

/*
 * Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;
 */
public class Exercicio13 {

	public static void main(String[] args) {

		int numero;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número ");
		numero = entrada.nextInt();
		
		if(numero > 10) {
			System.out.println(numero + " é maior que 10");
		}
		else {
			System.out.println(numero + " não é maior que 10");
		}
		System.out.println("FIM");
		
		entrada.close();
	}

}
