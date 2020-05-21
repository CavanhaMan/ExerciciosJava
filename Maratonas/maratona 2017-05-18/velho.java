import java.util.Locale;
import java.util.Scanner;

public class velho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		

		int N, i, aux=0, posicao=0;

		N = sc.nextInt();
		String[] nomes = new String[N];
		int[] idade = new int[N];
			
		for(i=0; i<N; i++){
			nomes[i] = sc.next();
			idade[i] = sc.nextInt();
		}
			
		for(i=0; i<N; i++){
			if (aux < idade[i]){
				aux=idade[i];
				posicao=i;
			}
		}
				
			System.out.printf("Pessoa mais velha: %s\n",nomes[posicao]);

		sc.close();
	}
}