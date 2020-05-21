import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class saque {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double saldo, saque, taxa;
		
		saldo = sc.nextDouble();
		saque = sc.nextDouble();
		
		taxa = saque * 1 / 100;

		System.out.printf("%.2f\n",saldo-saque-taxa);

		sc.close();
	}
}