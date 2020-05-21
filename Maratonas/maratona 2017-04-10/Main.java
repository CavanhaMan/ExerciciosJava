import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		int n;
		double a1, a2, a3;

		n = sc.nextInt();
		
		while (n > 0){
			a1 = sc.nextDouble();
			a2 = sc.nextDouble();
			a3 = sc.nextDouble();
			System.out.printf("%.2f\n",a1+a2+a3);
			n--;
		}
		sc.close();
	}
}