import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int x=1; 
		
		while (x != 0){
			x = sc.nextInt();
		
			for (int aux = 1; aux <= x; aux++){
				System.out.printf(" %d",aux);
			}
			System.out.println("");
		}	
		sc.close();
	}
}