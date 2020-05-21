import java.util.Locale;
import java.util.Scanner;

public class diag1 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int L, C;
		double SOMA=0.0;
		
		int N = sc.nextInt();
		
		double[][] MATRIX = new double[N][N];

		for(L=0 ; L<N ; L++)
			for(C=0 ; C<N ; C++)
				MATRIX[L][C]=sc.nextDouble();

		for(L=0 ; L<N ; L++)
			for(C=0 ; C<N ; C++)
				if (L==C)
					SOMA+=MATRIX[L][C];

		System.out.printf("Soma da diagonal: %.1f\n",SOMA);

	
		sc.close();
		}
	}