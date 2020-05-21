import java.util.Locale;
import java.util.Scanner;

public class parque {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double altura, alturamin;
		int n, conta=0;
		
		n = sc.nextInt();
		alturamin = sc.nextDouble();
		
		while (n > 0){
			altura = sc.nextDouble();
			if (altura >= alturamin)
				conta++;
			n--;
		}
		System.out.println(conta);
		sc.close();
	}
}