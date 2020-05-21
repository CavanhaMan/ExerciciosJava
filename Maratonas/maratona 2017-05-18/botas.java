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
		
		String[] pe = new String[N];
		int[] numero = new int[N];
				
		for(i=0; i<N; i++){
			numero[i] = sc.nextInt();
			pe[i] = sc.next();
		}
				
		for(i=0 ; i<N ; i++){
			auxNum=numero[i];
			auxPe=pe[i];
			for(j=0 ; j<N ; j++){ //se o número for igual, vou comparar os pés
				if (auxNum == numero[j]){
					compara=pe[j];
					if ((auxPe.equals("D") && compara.equals("E")) || auxPe.equals("E") && compara.equals("D"))
						somapar++;
					} //minha ideia foi jogar um pé no auxPe
				}    //e o outro pé no compara (tinha feito direto na 1a versao)
			}		//se for igual somapar - depois tenho q dividir por 2
			System.out.printf("%d",somapar/2); //porque desse jeito ele soma 1 para cada pé
		else
			sc.close();
		sc.close();
	}
}