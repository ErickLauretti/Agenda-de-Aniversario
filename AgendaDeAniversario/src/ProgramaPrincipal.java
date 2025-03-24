import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaPrincipal {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Pessoa> pessoas = new ArrayList<>();

	public static void main(String[] args) {
		int escolha;
		do {
			System.out.println("AGENDA DE ANIVERSÁRIO");
			System.out.println("Digite uma opção: ");
			System.out.println("1 - Inserir");
			System.out.println("2 - Remover");
			System.out.println("3 - Pesquisar por nome");
			System.out.println("4 - Pesquisar por dia e mês");
			System.out.println("5 - Pesquisar por mês");
			System.out.println("0 - Sair");
			escolha = sc.nextInt();
			
			switch(escolha) {
				case 1:
					inserir();
					break;
				case 2:
					remover();
					break;
				case 3:
					pesquisarPorNome();
					break;
				case 4:
					pesquisarDiaMes();
					break;
				case 5:
					pesquisarMes();
					break;
				default:
					System.err.println("Número inválido");
			}
		} while (escolha != 0);
		
	}
	
	private static void inserir() {
		System.out.println("Digite o nome: ");
		String nome = sc.next();
		System.out.println("Digite o telefone: ");
		String telefone = sc.next();
		System.out.println("Digite o email: ");
		String email = sc.next();
		System.out.println("Digite a data de nascimento: ");
		String data = sc.next();
		try {
			Pessoa pessoa = new Pessoa(nome, telefone, email);
			pessoas.add(pessoa);
			System.out.println("Pessoa inserida com sucesso!");
		} catch(Exception e) {
			System.out.println("Não foi possivel cadastrar a pessoa");
		}
	}
	
	private static void remover() {
		System.out.println("implementar a lógica");
	}
	private static void pesquisarPorNome() {
		System.out.println("implementar a lógica");
	}
	private static void pesquisarDiaMes() {
		System.out.println("implementar a lógica");
	}
	private static void pesquisarMes() {
		System.out.println("implementar a lógica");
	}

}
