/* Rodrigo CavanhaMan */
import java.util.Locale;
import java.util.Scanner;

public class reajuste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double reajuste;
		int N = sc.nextInt();
		double[] salario = new double[N];

		for(int x=0 ; x<N ; x++){
			salario[x] = sc.nextDouble();
		}
		
		reajuste = sc.nextDouble();
		
		for(int i=0 ; i<N ; i++)
			salario[i] += (salario[i]*reajuste)/100;
		
		for(int j=0 ; j<N ; j++)
			System.out.printf("%.2f\n",salario[j]);

		sc.close();
	}
}
