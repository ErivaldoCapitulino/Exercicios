import java.util.Scanner;

/*
 * Escreva um algoritmo que leia o nome de um aluno e as 
 * notas das três provas que ele obteve no semestre. 
 * No finalinformar o nome do aluno e a sua média (aritmética);
 */
public class Media {

	public static void main(String[] args) {
		
		String nome;
		float nota1;
		float nota2;
		float nota3;
		float media;
		float soma;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome do aluno: ");
		nome = entrada.nextLine();
		System.out.println("Informe a sua 1ª nota:");
		nota1 = entrada.nextFloat();
		System.out.println("Informe a sua 2ª nota:");
		nota2 = entrada.nextFloat();
		System.out.println("Informe a sua 3ª nota:");
		nota3 = entrada.nextFloat();
		
		soma = nota1 + nota2 + nota3;
		media = soma / 3;
		
		System.out.println("Nome do Aluno: " + nome);
		System.out.println("Média do Aluno: " + media);
		entrada.close();

	}

}
