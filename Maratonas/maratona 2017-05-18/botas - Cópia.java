import java.util.Locale;
import java.util.Scanner;

public class botas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		

		int N, i, j, somapar=0;
		int auxNum=0;
		String auxPe, compara;
		
		N = sc.nextInt();
		
		if(N%2 == 0 && N>=2){
			String[] pe = new String[N];
			int[] numero = new int[N];
				
			for(i=0; i<N; i++){
				numero[i] = sc.nextInt();
				pe[i] = sc.next();
				if (numero[i]<30 || numero[i]>60)
					sc.close();
			}
				
			for(i=0 ; i<N ; i++){
				auxNum=numero[i];
				auxPe=pe[i];
				for(j=0 ; j<N ; j++){
					if (auxNum == numero[j]){
						compara=pe[j];
						if ((auxPe.equals("D") && compara.equals("E")) || auxPe.equals("E") && compara.equals("D"))
							somapar++;
					}
				}
			}
			System.out.printf("%d",somapar/2);
		}
		else
			sc.close();
		sc.close();
	}
}