import java.util.Locale;
import java.util.Scanner;

public class rebaixado {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int menor, posicao=0;
		int N = sc.nextInt();
		
		String[] time = new String[N];
		int[] pontos = new int[N];
		
	
			for(int i=0 ; i<N ; i++){
					time[i]=sc.next();
					pontos[i]=sc.nextInt();
			}
			menor=pontos[1];
			for(int i=0 ; i<N ; i++)
				if(pontos[i]<=menor){
					menor=pontos[i];
					posicao=i;
				}

			System.out.println("Rebaixado: " + time[posicao]);

		sc.close();
		}
	}