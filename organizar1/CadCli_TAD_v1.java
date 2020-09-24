/*
╔════════════════════╗
║ Rodrigo CavanhaMan ║
║        IFTM        ║
║      Aula TAD      ║
╚════════════════════╝
*/
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class principal {
	static Scanner sc = new Scanner(System.in);
	// a declaração do Scanner vai declarado dentro da classe principal
	// a fim de atender todo o programa, sem precisar repetir sempre
	// para evitar erros, usamos a declaração "static".
	
	public static void main(String[] args) {
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		String continuar="s";

		System.out.println("╔═══════════════════════════════════════╗");
		System.out.println("║    SISTEMA DE CADASTRO DE CLIENTES    ║");
		System.out.println("╚═══════════════════════════════════════╝");
		
		while(continuar.equals("s")){
			Cliente novoCliente = lerDados();
			clientes.add(novoCliente);
			System.out.println("\nCadastro efetuados com sucesso! \n");
			System.out.println("Deseja adicionar um novo cliente?");
			System.out.println("(Digite \"s\" para Sim ou \"n\" para Não)");
			continuar = sc.nextLine().toLowerCase();
		}
		System.out.println("\n");
		System.out.println("╔═══════════════════════════════════════╗");
		System.out.println("║          Sistema finalizado!          ║");
		System.out.println("╚═══════════════════════════════════════╝");
	}

	/**
	 * Função para entrada de dados no sistema
	 * @return cliente - retorna todas as variáveis dentro da classe Cliente
	 */
	private static Cliente lerDados(){

		Cliente cliente = new Cliente();
		
		System.out.println("Informe o CPF:");
		cliente.cpf = sc.nextLine();
		System.out.println("Informe a idade:");
		cliente.idade = sc.nextInt();
		System.out.println("Informe o nome:");
		cliente.nome = sc.nextLine();
		sc.nextLine();
		System.out.println("Informe o telefone:");
		cliente.telefone = sc.nextLine();

		return cliente;
	}
	
	private static Cliente imprimeDados(){
		for (int i=0 ; i<clientes.size() ; i++){
			System.out.printf("Imprimindo cliente da posição %d",i);
			System.out.printf("Nome: %s",clientes.nome);
			System.out.printf("CPF: %s",clientes.nome);
			System.out.printf("Nome: %s",clientes.nome);
			System.out.printf("Nome: %s",clientes.nome);
			System.out.printf("Nome: %s",clientes.nome);
		}
	}
}

/**
 * Classe para armazenar o cadastro do cliente
 * @author CavanhaMan
 */
class Cliente {
	String cpf;
	Integer idade;
	String nome;
	String telefone;
}

