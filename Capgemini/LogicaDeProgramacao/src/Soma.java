import java.util.Scanner;

/*
 * Faça um algoritmo que 
 * receba dois números e exiba o resultado da sua soma;
 */
public class Soma {

	public static void main(String[] args) {
		
		int numero1 = 0;
		int numero2 = 0;
		int soma = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um  número: ");
		numero1 = entrada.nextInt();
		
		System.out.println("Digite segundo número: ");
		numero2 = entrada.nextInt();
		
		soma = numero1 + numero2;
		System.out.println("A soma dos números informados é " + soma);
	}
}
