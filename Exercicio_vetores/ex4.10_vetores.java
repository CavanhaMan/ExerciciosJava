/*
+--------------------------+
|    Rodrigo CavanhaMan    |
|           IFTM           |
|  Sistemas para Internet  |
+--------------------------+
*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double maior=0, menor=100, soma=0, somaMulher=0; 
		int homens=0, mulheres=0;

		int N = sc.nextInt();
		String[] sexo = new String[N];
		double[] altura = new double[N];
		
		for(int x=0 ; x<N ; x++){
			altura[x] = sc.nextDouble();
			sexo[x] = sc.next();
		}
		
		for(int i=0 ; i<N ; i++){
			if(menor > altura[i])
				menor = altura[i];
			if(maior < altura[i])
				maior = altura[i];
			if(sexo[i].equals("F")){
				mulheres++;
				somaMulher+=altura[i];
			}
			if(sexo[i].equals("M"))
				homens++;
		}

		System.out.printf("Menor altura = %.2f\n",menor);
		System.out.printf("Maior altura = %.2f\n",maior);
		System.out.printf("Media das alturas das mulheres = %.2f\n",somaMulher/mulheres);
		System.out.printf("Numero de homens = %d\n",homens);

		sc.close();
	}
}
