/*
╔════════════════════╗
║ Rodrigo CavanhaMan ║
║        IFTM        ║
║      Aula TAD      ║
╚════════════════════╝
*/
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;
//import java.util.List;
//import java.util.Set;

public class aulaTAD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		Atividade[] atividades = new Atividade[20];
		
/*		List<Atividade> atividades1 = new ArrayList<>();
		Set<Atividade> atividades2 = new LinkedHandSet<>();
*/
		atividades[0].modalidade = "Curso";
		atividades[0].horas = 20;

		atividades[1].modalidade = "Palestra";
		atividades[1].horas = 20;
		
		sc.close();
	}
}

class Atividade{
	String modalidade;
	Integer horas;;
	Date dataInicio;
	Date dataFim;
	boolean dentroIftm;
	String cpfAluno;
}