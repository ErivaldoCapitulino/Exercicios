import java.util.Scanner;

/*
 * Faça um algoritmo que receba dois números e ao final 
 * mostre a soma, subtração, 
 * multiplicação e a divisão dos dois números lidos;
 */
public class Calculadora {

	public static void main(String[] args) {
		int numero1 = 0;
		int numero2 = 0;
		int soma = 0;
		int subtracao = 0;
		float multiplicacao = 0.0f;
		float divisao = 0.0f;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um  número: ");
		numero1 = entrada.nextInt();

		System.out.println("Digite segundo número: ");
		numero2 = entrada.nextInt();

		soma = numero1 + numero2;
		subtracao = numero1 + numero2;
		multiplicacao = numero1 * numero2;
		divisao = numero1 / numero2;
		
		System.out.println("A soma dos números informados é " + soma);
		System.out.println("A subtração dos números informados é " + subtracao);
		System.out.println("A multiplicação dos números informados é " + multiplicacao);
		System.out.println("A divisão dos números informados é " + divisao);
	}
}
