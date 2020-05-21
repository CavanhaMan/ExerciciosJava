import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class bateria {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int vezes;
		Double tempojogo, temporestante;
		
		temporestante = sc.nextDouble();
		vezes = sc.nextInt();
		 
		while (vezes > 0){
			tempojogo = sc.nextDouble();
			temporestante = temporestante - tempojogo;
			
			if (temporestante >= 0)
				System.out.printf("%.1f\n",temporestante);
			else if (temporestante < 0)
				System.out.println("recarregar");
			
			vezes--;
		}
		sc.close();
	}
}