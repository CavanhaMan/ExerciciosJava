import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class maior {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int n=1, aux=1, maior=0;
		
		while (n <= 100 && aux!=0){
			aux = sc.nextInt();
			if (aux > maior){
				maior = aux;
			}
			n = n + 1;
		}
			System.out.println(maior);
		
		sc.close();
	}
}