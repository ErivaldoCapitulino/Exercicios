import java.util.Scanner;

/*
 * Escreva um algoritmo que leia o nome de um vendedor, 
 * o seu salário fixo e o total de vendas efetuadas por 
 * ele no mês (em dinheiro). Sabendo que este vendedor 
 * ganha 15% de comissão sobre suas vendas efetuadas, 
 * informar o seu nome, o salário fixo e salário no final 
 * do mês;
 */

public class Vendedor {

	public static void main(String[] args) {
		
		String nomeDoVendedor;
		double salario;
		double totalVendas;
		double comissao = 0.15;
		double salarioFinal;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o nome do vendedor: ");
		nomeDoVendedor = entrada.nextLine();
		System.out.println("Qual o seu salário Fixo");
		salario = entrada.nextDouble();
		System.out.println("Informe o total de vendas efetuadas no mês");
		totalVendas = entrada.nextDouble();
		
		salarioFinal = salario + (totalVendas * comissao);
		
		System.out.println("Nome: " + nomeDoVendedor);
		System.out.println("Salário Fixo: "+ salario);
		System.out.println("Salario Final: " + salarioFinal);
		entrada.close();
	}

}
