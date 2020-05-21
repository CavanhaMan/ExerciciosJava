import java.util.Locale;
import java.util.Scanner;

public class bolos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double preco;
		int n, quant, somaquant=0;
		
		preco = sc.nextDouble();
		n = sc.nextInt();
		while (n > 0){
			quant = sc.nextInt();
			somaquant += quant;
			n--;
		}
		System.out.printf("%.2f\n",somaquant*preco);
		sc.close();
	}
}