import java.util.Locale;
import java.util.Scanner;

public class trocamat {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int L, C;
		double AUX=0;
		int N = sc.nextInt();

		int[] posicaoL = new int[N];
		int[] posicaoC = new int[N];

		double[] MENOR = new double[N];
		double[][] MATRIX = new double[N][N];

		for(L=0 ; L<N ; L++)
			for(C=0 ; C<N ; C++)
				MATRIX[L][C]=sc.nextDouble();

		for(L=0 ; L<N ; L++)
			for(C=0 ; C<N ; C++)
				if(MATRIX[L][C]<MATRIX[L][L]){
					MENOR[L]=MATRIX[L][C];
					posicaoL[L]=L;
					posicaoC[L]=C;
				}
		
		for(L=0 ; L<N ; L++)
			for(C=0 ; C<N ; C++)
				if(MENOR[L]<MATRIX[L][L]){
					AUX=MATRIX[L][L];
					MATRIX[L][L]=MATRIX[posicaoL[L]][posicaoC[L]];
					MATRIX[posicaoL[L]][posicaoC[L]]=AUX;
				}
					
		for(L=0 ; L<N ; L++){
			for(C=0 ; C<N-1 ; C++)
				System.out.printf("%.1f ",MATRIX[L][C]);
			System.out.printf("%.1f\n",MATRIX[L][C]);
		}
	
		sc.close();
		}
	}