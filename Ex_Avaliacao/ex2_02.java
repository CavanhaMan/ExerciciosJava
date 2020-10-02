package projeto01;
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
		if (cidade.equals("Uberlandia"))
			System.out.printf("O custo de vida em %s e R$ %.2f.", cidade, custo);
		else if (cidade.equals("Brasilia"))
			System.out.printf("O custo de vida em %s e R$ %.2f.", cidade, custo*2);
		else
			System.out.printf("O custo de vida em %s e R$ %.2f.", cidade, custo/2);
		
		sc.close();
	}
}
