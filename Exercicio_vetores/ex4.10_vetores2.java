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
		
		int i, contaF=0, contaM=0;
		double menor, maior,somaF=0, somaM=0;
		int N = sc.nextInt();
		String[] sexo = new String[N];
		double[] altura = new double[N];
		
			for(i=0 ; i<N ; i++){
				altura[i] = sc.nextDouble();
				sexo[i] = sc.next();
			}
			
			menor=altura[0];
			maior=altura[0];
			for(i=0 ; i<N ; i++){
				//acha a menor pessoa:
				if (menor > altura[i])
					menor = altura[i];
				
				//acha a maior pessoa:
				if (maior < altura[i])
					maior = altura[i];
				
				//conta Femininos para a média
				if (sexo[i].equals("F")){
					contaF++;
					somaF+=altura[i];
				}
				
				//conta Masculinos para a média (não foi pedido)
				if (sexo[i].equals("M")){
					contaM++;
					somaM+=altura[i];
				}
				
			}
			
			//imprime resultados:
			System.out.printf("Menor altura = %.2f\n",menor);
			System.out.printf("Maior altura = %.2f\n",maior);
			System.out.printf("Media das alturas das mulheres = %.2f\n",somaF/contaF);
			System.out.printf("Media das alturas dos homens = %.2f\n",somaM/contaM);
		
		sc.close();
	}
}