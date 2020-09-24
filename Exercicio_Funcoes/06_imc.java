/*-------------------------*
|    Rodrigo CavanhaMan    |
|           IFTM           |
|  Sistemas para Internet  |
+--------------------------+
Qual a pessoa com maior imc?
IMC = peso / (altura * altura)
4
Ana
1.60
53
Joao
1.72
68
Maria
1.75
68
Ze
1.84
101
*/
import java.util.Locale;
import java.util.Scanner;

public class imc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int i, posicao=0, x=0;
		double maior;
		
		int N = sc.nextInt();
		double[] altura = new double[N];
		double[] peso = new double[N];
		String[] nome = new String[N];
		double[] imc = new double[N];
		
		while (x<N){
			for(i=0 ; i<N ; i++){
				nome[i]   = sc.next();
				altura[i] = sc.nextDouble();
				peso[i]   = sc.nextDouble();
			}
			
			for(i=0 ; i<N ; i++)
				imc[i] = peso[i] / (altura[i] * altura[i]);
			
			maior = imc[1];
			for(i=0 ; i<N ; i++)
				if (maior < imc[i]){
					maior = imc[i];
					posicao = i;
				}
				
			System.out.printf("Pessoa com maior IMC: %s.\n",nome[posicao]);
			
			x++;
		}
		sc.close();
	}
}