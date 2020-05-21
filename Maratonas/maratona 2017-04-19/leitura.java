import java.util.Locale;
import java.util.Scanner;

public class leitura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		//se branco = 255
		//se preto = 0
		//ex: 255 0 255 255 255
		//media <= 127 = preto
		//media > 127 = branco
		//se mais de um marcado = desconsiderar
		
		int n, a, b, c, d, e;
		n = sc.nextInt();		
	while (n != 0){
		
		for(int i = 0; i < n; i++){
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			e = sc.nextInt();
			if (a<=127 && b>127 && c>127 && d>127 && e>127)
				System.out.println("A");
			else if (a>127 && b<=127 && c>127 && d>127 && e>127)
				System.out.println("B");
			else if (a>127 && b>127 && c<=127 && d>127 && e>127)
				System.out.println("C");
			else if (a>127 && b>127 && c>127 && d<=127 && e>127)
				System.out.println("D");
			else if (a>127 && b>127 && c>127 && d>127 && e<=127)
				System.out.println("E");
			else
				System.out.println("*");
		}
		n = sc.nextInt();
	}
		sc.close();
	}
}