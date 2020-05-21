/* Rodrigo CavanhaMan */
import java.util.Locale;
import java.util.Scanner;

public class caixeta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int conta=0;
		int N = sc.nextInt();
		int[] cartas = new int[N];

		for(int x=0 ; x<N ; x++){
			cartas[x] = sc.nextInt();
		}
		int x = sc.nextInt();
		
		for(int i=0 ; i<N ; i++){
			if(cartas[i] == x){
				conta++;
			}
		}
		
			System.out.println(conta);

		sc.close();
	}
}
