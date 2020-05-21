/*
+--------------------------+
|    Rodrigo CavanhaMan    |
|           IFTM           |
|  Sistemas para Internet  |
+--------------------------+
*/
import java.util.Locale;
import java.util.Scanner;

public class academicos {

	/**
	* Imprime na tela um cabeçalho com seus dados acadêmicos tais como
	* seu nome, número de matrícula, ano, turno e curso
	*/
	public static void mostraCabecalho(){
		System.out.format("╔════════════════════════════════╗%n");
		System.out.format("║        DADOS ACADEMICOS        ║█%n");
		System.out.format("╠════════════════════════════════╣█%n");
		System.out.format("║ Nome: Rodrigo Baltazar         ║█%n");
		System.out.format("║ Matrícula: 123456789           ║█%n");
		System.out.format("║ Ano: 2017 ═ Noturno            ║█%n");
		System.out.format("║ Curso: Sistemas para Internet  ║█%n");
		System.out.format("╚════════════════════════════════╝█%n");
		System.out.format(" ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀%n%n");
	}
	
	/**
	* Imprime na tela os nomes e cargas horárias das disciplinas do
	* primeiro semestre do seu curso
	*/
	public static void mostraDisciplinas(){
		System.out.format("╔══════════════════════════════════════════════════════════╗%n");
		System.out.format("║                       DISCIPLINAS                        ║█%n");
		System.out.format("╠═════════════════════════════╦════════════╦═══════════════╣█%n");
		System.out.format("║ DISIPLINA:                  ║PROFESSOR:  ║ Carga Horária ║█%n");
		System.out.format("╠═════════════════════════════╬════════════╬═══════════════╣█%n");
		System.out.format("║ Lógica de Programação       ║ Nélio      ║ 105h          ║█%n");
		System.out.format("║ Fundamentos de Web Design 1 ║ Angoti     ║ 75h           ║█%n");
		System.out.format("║ Inglês Instrumental         ║ Juliana    ║ 30h           ║█%n");
		System.out.format("║ Metodologia Científica      ║ M. Lourdes ║ 20h           ║█%n");
		System.out.format("║ Sistemas Operacionais       ║ Carlos     ║ 30h           ║█%n");
		System.out.format("║ Projeto Integrador          ║ Angoti     ║ 10h           ║█%n");
		System.out.format("╚═════════════════════════════╩════════════╩═══════════════╝█%n");
		System.out.format(" ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀%n%n");
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
	
		mostraCabecalho();
		mostraDisciplinas();

		sc.close();
	}

}
