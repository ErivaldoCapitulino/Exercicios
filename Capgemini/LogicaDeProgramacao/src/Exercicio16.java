import java.util.Scanner;

/*
 * Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. 
 * Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), 
 * Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9);
 */
public class Exercicio16 {

	public static void main(String[] args) {

		String nomeAluno;
		float primeiraNota;
		float segundaNota;
		float terceiraNota;
		float soma;
		float media;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome do aluno: ");
		nomeAluno = entrada.nextLine();
		
		System.out.print("Informe sua 1ª nota: ");
		primeiraNota = entrada.nextFloat();
		
		System.out.print("Informe sua 2ª nota: ");
		segundaNota = entrada.nextFloat();
		
		System.out.print("Informe sua 3ª nota: ");
		terceiraNota = entrada.nextFloat();
		
		soma = primeiraNota + segundaNota + terceiraNota;
		media = soma / 3;
		
		if(media <= 5) {
			System.out.println(nomeAluno);
			System.out.println("Resultado: Média " + media + " Reprovado");
		}
		else if(media >= 5.1 && media <= 6.9) {
			System.out.println(nomeAluno);
			System.out.println("Resultado: Média " + media + " Recuperação");
		}
		else {
			System.out.println(nomeAluno);
			System.out.println("Resultado: Média " + media + " Aprovado");
		}
		
		System.out.println();
		entrada.close();
	}

}
