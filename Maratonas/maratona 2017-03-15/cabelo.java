import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class cabelo {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int aposta, mao, maoE=0, maoD=0;

		aposta = sc.nextInt();
		mao = sc.nextInt();

		if (mao == 0){
			maoE = aposta;
			maoD = aposta * aposta;
		}
		else if (mao == 1){
			maoE = aposta * 2;
			maoD = maoE + aposta;
		}

		System.out.println(maoE);
		System.out.println(maoD);
		
		sc.close();
	}
}