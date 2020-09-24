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
		String[] nome = new String[N];
		double[] nota1 = new double[N];
		double[] nota2 = new double[N];
		double[] media = new double[N];
		
		for(int x=0 ; x<N ; x++){
			nome[x] = sc.next();
			nota1[x] = sc.nextDouble();
			nota2[x] = sc.nextDouble();
			media[x] = (nota1[x]+nota2[x])/2;
		}
		
		System.out.println("Alunos aprovados:");
		for(int i=0 ; i<=N ; i++){
			if(media[i] >= 6.0){
				System.out.println(nome[i]);
			}
		}
		sc.close();
	}
}
