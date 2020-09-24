import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int MEDIA=0, l, c, auxL, auxC;
		char O = sc.next().charAt(0);
		double SOMA=0.0;
		double[][] MATRIZ = new double[12][12];

		for(l=0; l<12; l++)
			for(c=0; c<12; c++)
				MATRIZ[l][c] = sc.nextDouble();

		//MATRIZ[LINHA][COLUNA]

		auxL=11;
		auxC=11;
		for(l=0; l<auxL; l++){
			for(c=0; c<auxC; c++){
				SOMA += MATRIZ[l][c];
				if (MATRIZ[l][c] != 0)
					MEDIA++;
			}
			auxC--;
			auxL--;
		}

		if (O == 'S')
			System.out.printf("%.1f\n",SOMA);
		if (O == 'M')
			System.out.printf("%.1f\n",SOMA/66.0);

		sc.close();
	}
}