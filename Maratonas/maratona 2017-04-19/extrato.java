import java.util.Locale;
import java.util.Scanner;

public class extrato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double saldo, entrada;
		
		saldo = sc.nextDouble();
		entrada = sc.nextDouble();
		while (entrada != 0){
			saldo = saldo + entrada;
			entrada = sc.nextDouble();
		}
		System.out.printf("%.2f\n",saldo);
		sc.close();
	}
}