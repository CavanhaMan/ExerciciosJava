/*---------------------*
| Rodrigo CavanhaMan   |
| Exercicio Avaliativo |
| 02                   |
*----------------------*/
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double custo = Double.parseDouble(sc.nextLine());
		String cidade = sc.nextLine();
		double custoCalculado = ajustaCusto(cidade,custo);
		System.out.printf("O custo de vida em %s e R$ %.2f.", cidade, custoCalculado);

		sc.close();
	}

	private static double ajustaCusto(String cidade, double custo) {
		if (cidade.equals("Uberlandia"))
			return custo;
		else if (cidade.equals("Brasilia"))
			return custo*2;
		else
			return custo/2;
	}
}
