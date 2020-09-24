import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int n, x, y, aux, soma;
		
		n = sc.nextInt();

		while (n > 0){
			x = sc.nextInt();
			y = sc.nextInt();
			soma = 0;
			
			if (x > y){
				aux = x;
				x = y+1;
				y = aux;
			}
			else {
				x = x +1;
			}
			
			while (x < y){
				if (x % 2 != 0){
					soma = soma + x;
				}
				x = x + 1;
			}
		n = n - 1;
		System.out.println(soma);
			
		}
		
//		System.out.printf("%d segundo(s)\n",Stotal);
		
		sc.close();
	}
}