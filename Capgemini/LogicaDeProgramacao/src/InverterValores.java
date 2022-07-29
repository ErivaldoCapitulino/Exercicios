import java.util.Scanner;

/*
 *Leia dois valores para as variáveis A e B, 
 *e efetuar as trocas dos valores de forma que 
 *a variávelApasse a possuir ovalor da variável B 
 *e a variável B passe a possuir o valor da variável A.
 *Apresentar osvalores trocados; 
 */

public class InverterValores {

	public static void main(String[] args) {
		
		int a;
		int b;
		int aux;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um número para letra A");
		a = entrada.nextInt();
		System.out.println("Informe um número para letra B");
		b = entrada.nextInt();
		
		aux = a;
		a = b;
		b = aux;
		
		System.out.println("Valor de A: " + a);
		System.out.println("Valor de B: " + b);
		
		entrada.close();

	}

}
