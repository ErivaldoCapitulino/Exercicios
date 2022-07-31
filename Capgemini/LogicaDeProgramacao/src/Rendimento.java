import java.util.Scanner;

/*
 * Faça um algoritmo que receba um valor que foi depositado e exiba o valor 
 * com rendimento após um mês.Considere fixo o juro da poupança em 0,07% a. m;
 */
public class Rendimento {

	public static void main(String[] args) {
		
		double valorDepositado;
		double juroPoupanca = 0.07;
		double valorComRendimento;
		int tempo = 2;
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe valor depositado");
		valorDepositado = entrada.nextDouble();
			
		valorComRendimento = (juroPoupanca * valorDepositado) + valorDepositado;
		System.out.println("O rendimento do depósito após um mês é: R$" + valorComRendimento);
		entrada.close();
	}

}
