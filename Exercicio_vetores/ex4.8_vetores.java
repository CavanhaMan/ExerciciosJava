/*-------------------------*
|    Rodrigo CavanhaMan    |
|           IFTM           |
|  Sistemas para Internet  |
*--------------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int maior=0, posicao=0;
		int N = sc.nextInt();
		int[] idade = new int[N];
		String[] nome = new String[N];
		for(int x=0 ; x<N ; x++){
			nome[x] = sc.next();
			idade[x] = sc.nextInt();
		}
		
		for(int i=0 ; i<=N ; i++){
			if(maior < idade[i]){
				maior = idade[i];
				posicao = i;
			}
		}
		
		System.out.println("Pessoa mais velha: " + nome[posicao]);

		sc.close();
	}
}
