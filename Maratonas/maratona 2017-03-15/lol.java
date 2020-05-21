import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class lol {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int killA1, killA2, killA3, killA4, killA5,
			killB1, killB2, killB3, killB4, killB5,
			somaA, somaB;
		
		killA1 = sc.nextInt();
		killA2 = sc.nextInt();
		killA3 = sc.nextInt();
		killA4 = sc.nextInt();
		killA5 = sc.nextInt();
		killB1 = sc.nextInt();
		killB2 = sc.nextInt();
		killB3 = sc.nextInt();
		killB4 = sc.nextInt();
		killB5 = sc.nextInt();

		somaA = killA1 + killA2 + killA3 + killA4 + killA5;
		somaB = killB1 + killB2 + killB3 + killB4 + killB5;
		
		if (somaA > somaB){
			System.out.printf("O TIME A VENCEU COM %d KILLS\n",somaA);
		}
		else{
			System.out.printf("O TIME B VENCEU COM %d KILLS\n",somaB);
		}
		
		sc.close();
	}
}