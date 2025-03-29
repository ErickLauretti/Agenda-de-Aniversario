import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaPrincipal {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Pessoa> pessoas = new ArrayList<>();

    public static void main(String[] args) {
        char escolha;
        do {
            System.out.println("\n=======================");
            System.out.println(" AGENDA DE ANIVERSÁRIO");
            System.out.println("=======================");
            System.out.println("Digite uma opção: ");
            System.out.println("1 - Inserir");
            System.out.println("2 - Remover");
            System.out.println("3 - Pesquisar por nome");
            System.out.println("4 - Pesquisar por dia e mês");
            System.out.println("5 - Pesquisar por mês");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            String entrada = sc.nextLine().trim();
            escolha = entrada.isEmpty() ? ' ' : entrada.charAt(0);

            switch (escolha) {
                case '1':
                    inserir();
                    break;
                case '2':
                    remover();
                    break;
                case '3':
                    pesquisarPorNome();
                    break;
                case '4':
                    pesquisarDiaMes();
                    break;
                case '5':
                    pesquisarMes();
                    break;
                case '0':
                    System.out.println("Saindo...");
                    break;
                default:
                    System.err.println("Número inválido! Tente novamente.");
            }
        } while (escolha != '0');

        sc.close();
    }

    private static void inserir() {
        System.out.println("\n=== Inserir Pessoa ===");
        //sc.nextLine(); // Limpar buffer do Scanner

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o telefone: ");
        String telefone = sc.nextLine();

        System.out.print("Digite o email: ");
        String email = sc.nextLine();

        System.out.print("Digite o dia que nasceu: ");
        int dia = sc.nextInt();

        System.out.print("Digite o mês que nasceu: ");
        int mes = sc.nextInt();
        sc.nextLine(); // Limpar o buffer do Scanner

        Data data = new Data(dia, mes);
        if (!data.verificaData()) {
            System.err.println("Data inválida! Pessoa não cadastrada.");
            return;
        }

        try {
            Pessoa pessoa = new Pessoa(nome, telefone, email, dia, mes);
            for (Pessoa p : pessoas) {
                if (pessoa.getNome().equalsIgnoreCase(p.getNome())) {
                    System.err.println("Pessoa já cadastrada!");
                    return;
                }
            }
            pessoas.add(pessoa);
            System.out.println(nome + " inserido(a) com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro ao cadastrar pessoa.");
        }
    }

    private static void remover() {
        System.out.println("\n=== Remover Pessoa ===");
        System.out.print("Digite o nome da pessoa que deseja remover: ");
        String nome = sc.nextLine();

        boolean removeu = false;
        for (int i = 0; i < pessoas.size(); i++) {
            if (nome.equalsIgnoreCase(pessoas.get(i).getNome())) {
                pessoas.remove(i);
                removeu = true;
                System.out.println(nome + " removido(a) com sucesso!");
                break;
            }
        }

        if (!removeu) {
            System.err.println("ERRO: " + nome + " não encontrado(a).");
        }
    }

    private static void pesquisarPorNome() {
    	System.out.println("\n=== Pesquisa: Por Nome ===");
    	System.out.print("Insira o nome que deseja pesquisar: ");
    	String nome = sc.nextLine();
    	
    	 boolean existe = false;
         for (int i = 0; i < pessoas.size(); i++) {
             if (nome.equalsIgnoreCase(pessoas.get(i).getNome())) {
                 System.out.println(pessoas.get(i).toString());
                 existe = true;
             }
         }
         if(!existe) {
        	 System.err.println("NOME INEXISTENTE");
         }
    	
    }

    private static void pesquisarDiaMes() {
        System.out.println("\n=== Pesquisa: Por Dia e Mês ===");
        System.out.println("Digite o dia do aniversário: ");
        int dia = sc.nextInt();
        System.out.println("Digite o mês do aniversário: ");
        int mes = sc.nextInt();
        sc.nextLine(); //limpar o buffer do scanner
        Data data = new Data(dia, mes);
        
        boolean existe = false;
        for (int i = 0; i < pessoas.size(); i++) {
        	if (data.getDia() == pessoas.get(i).getDataDeAniversario().getDia() &&
                    data.getMes() == pessoas.get(i).getDataDeAniversario().getMes()) {
                    System.out.println(pessoas.get(i).getNome());
        		existe = true;
        	}
        }
        if (!existe) {
        	System.err.println("NENHUM ANIVERSARIANTE");
        }
    }

    private static void pesquisarMes() {
        System.out.println("\n=== Pesquisa: Por Mês ===");
        System.out.println("Digite o mês do aniversário: ");
        int mes = sc.nextInt();
        sc.nextLine(); //limpar o buffer do scanner
        
        boolean existe = false;
        for (int i = 0; i < pessoas.size(); i++) {
        	if (mes == pessoas.get(i).getDataDeAniversario().getMes()) {
        		System.out.println(pessoas.get(i).getNome());
        		System.out.println(pessoas.get(i).getDataDeAniversario());
        		existe = true;
        	}
        }
        if (!existe) {
        	System.out.println("NENHUM ANIVERSARIANTE");
        }
    }
}
