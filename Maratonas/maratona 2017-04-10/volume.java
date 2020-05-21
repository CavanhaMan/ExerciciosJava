import java.util.Locale;
import java.util.Scanner;

public class volume {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		int volume, volumenovo=1;
				
		volume = sc.nextInt();
		while (volumenovo != 0){
			volumenovo = sc.nextInt();
			volume=volume+volumenovo;
			if (volume > 100)
				volume = 100;
			else if (volume < 0)
				volume = 0;
			else if (volumenovo == 0)
				break;
			System.out.println(volume);
		}
		sc.close();
	}
}