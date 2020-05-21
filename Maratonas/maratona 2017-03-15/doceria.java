import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class doceria {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double vr1, qt1, vr2, qt2, total;
		
		vr1 = sc.nextDouble();
		qt1 = sc.nextDouble();
		vr2 = sc.nextDouble();
		qt2 = sc.nextDouble();
		
		total = vr1 * qt1 + vr2 * qt2;

		System.out.printf("TOTAL = R$ %.2f\n",total);

		sc.close();
	}
}