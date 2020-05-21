import java.util.Locale;
import java.util.Scanner;

public class parlinha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int N, l, c, aux=0, posicao=0;

		N = sc.nextInt();
		int[][] matriz = new int[N][N];
			
		for(l=0 ; l<N ; l++)
			for(c=0 ; c<N ; c++)
				matriz[l][c] = sc.nextInt();

		System.out.println("NUMEROS PARES:");
		
		for(l=0 ; l<N ; l++)
			for(c=0 ; c<N ; c++)
				if (matriz[l][c] %2 == 0)
					System.out.printf("%d: %d\n",l,matriz[l][c]);
	
		sc.close();
	}
}