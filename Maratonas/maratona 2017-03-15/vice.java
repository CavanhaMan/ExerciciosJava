import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class vice {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int a,b,c,aux1,aux2=0;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		aux1 = Math.min(a, Math.min(b, c));
		//int maior = Math.max(a, Math.max(b,c));
		
		if (aux1 == a){
			aux2 = Math.min(b, c);
		}
		if (aux1 == b){
			aux2 = Math.min(a, c);
		}
		if (aux1 == c){
			aux2 = Math.min(a, b);
		}
		
		//System.out.println (a + b + c -aux1 - maior);
		
		System.out.println(aux2);

		sc.close();
	}
}