/* Rodrigo CavanhaMan */
import java.util.Locale;
import java.util.Scanner;

public class aprovados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double maior=0;
		int posicao=0;
		int N = sc.nextInt();
		String[] nome = new String[N];
		double[] nota1 = new double[N];
		
		for(int x=0 ; x<N ; x++){
			nome[x] = sc.next();
			nota1[x] = sc.nextDouble();
		}
		
		System.out.println("ALUNOS APROVADOS:");
		for(int i=0 ; i<N ; i++){
			if(nota1[i] >= 70.00)
				System.out.println(nome[i]);
			if(maior < nota1[i]){
				maior = nota1[i];
				posicao=i;
			}
		}
		
		System.out.println("MAIOR NOTA:");
		System.out.println(nome[posicao]);
			
		sc.close();
	}
}
