/*-------------------------*
|    Rodrigo CavanhaMan    |
|           IFTM           |
|  Sistemas para Internet  |
*--------------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int abaixo10=0, acima10=0, acima20=0; 
		double compras=0, vendas=0;
		int N = sc.nextInt();
		String[] produto = new String[N];
		double[] compra = new double[N];
		double[] venda = new double[N];
		double[] lucro = new double[N];
		
		for(int x=0 ; x<N ; x++){
			produto[x] = sc.next();
			compra[x] = sc.nextDouble();
			venda[x] = sc.nextDouble();
		}
		
		for(int i=0 ; i<N ; i++){
			lucro[i] = (venda[i] - compra[i]) / compra[i] * 100;
			if (lucro[i] < 10)
				abaixo10++;
			else if (lucro[i] >20)
				acima20++;
			else
				acima10++;
			compras+=compra[i];
			vendas+=venda[i];
		}

		System.out.printf("Lucro abaixo de 10%%: %d\n",abaixo10);
		System.out.printf("Lucro entre 10%% e 20: %d\n",acima10);
		System.out.printf("Lucro acima de 20%%: %d\n",acima20);
		
		System.out.printf("Valor total de compra: %.2f\n",compras);
		System.out.printf("Valor total de venda: %.2f\n",vendas);

		sc.close();
	}
}
