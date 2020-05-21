import java.util.Locale;
import java.util.Scanner;

public class parque {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		

		int N, i, conta=0;
		double permitida=0.0;
		N = sc.nextInt();
		double[] altura = new double[N];
			
		if (N>=2 && N<=100){
					
			for(i=0; i<N; i++)
				altura[i] = sc.nextDouble();
			
			permitida = sc.nextDouble();
			
			for(i=0; i<N; i++)
				if (altura[i] >= permitida)
					conta++;
				
			System.out.println(conta);

		}
		sc.close();
	}
}