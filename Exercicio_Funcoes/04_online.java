/*-------------------------*
|    Rodrigo CavanhaMan    |
|           IFTM           |
|  Sistemas para Internet  |
|                          |
|       EXERCICIO 4        |
*--------------------------*/
import java.util.Locale;
import java.util.Scanner;

public class online {

	public static void on_line(int vezes){
		
		System.out.format("╔════════════════════╗%n");
		for(int i=0 ; i<vezes ; i++){
			System.out.format("║ Online ou Offline? ║█%n");
		}
		System.out.format("╚════════════════════╝█%n");
		System.out.format(" ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀%n%n");
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		System.out.format("Quantas vezes quer repetir?");
		int N = sc.nextInt();
		
		on_line(N);

		sc.close();
	}

}
