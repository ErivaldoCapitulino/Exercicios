import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
		ArrayList<String> agenda = new ArrayList<String>();
		String nome;
		String idade;
		Scanner entrada = new Scanner(System.in);
		int opcao;

		try {
			do {

				System.out.println("==== AGENDA ====");
				
				System.out.println("-------------------");
				System.out.println("|1 - Cadastrar    |");
				System.out.println("|2 - Excluir      |");
				System.out.println("|3 - Listar       |");
				System.out.println("|4 - Pesquisar    |");
				System.out.println("|0 - Sair         |");
				System.out.println("-------------------");

				System.out.println("Escolha uma opção: ");
				opcao = entrada.nextInt();

				switch (opcao) {
				case 0:
					System.out.println("==== FIM ====");
					break;
				case 1:
					System.out.println("Informe o nome a ser cadastrado: ");
					nome = entrada.next();
					System.out.println("Informe a sua idade: ");
					idade = entrada.next();
					agenda.add(nome);
					agenda.add(idade);
					break;
				case 2:
					System.out.println("==== EXCLUIR ====");
					System.out.println("Qual usuário você quer excluir: ");
					nome = entrada.next();
					agenda.remove(nome);
					break;
				case 3:
					System.out.println("==== LISTAR ====");
					for (String i : agenda) {
						System.out.println(i);
					}
					break;
				case 4:
					System.out.println("==== SELECIONAR ====");

					System.out.println("Informe qual o usuário você quer pesquisar: ");
					nome = entrada.next();
					for (String i : agenda) {
						if (agenda.contains(nome)) {
							System.out.println(i);
							break;
						} else {
							System.out.println("Contato não está cadastrado");
							break;
						}
					}
					break;
				default:
					System.out.println("Valor não encontrado");
					break;
				}

			} while (opcao != 0);

		} catch (Exception e) {
			System.out.println("Opção errada só é possível usar as opções do MENU");
		}
		entrada.close();
	}

}
