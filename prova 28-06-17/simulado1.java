/*
+--------------------+
� Rodrigo CavanhaMan �
�        IFTM        �
� Simulado Prova Ex4 �
+--------------------+
*/
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int N = sc.nextInt();
		
		String nomes[] = new String[N];
		double precos[] = new double[N];
		
		lerDados(nomes,precos);
		mostrarProdutoEntre(nomes,precos,100.0,200.0);
		
		int pos = posicaoMenorElemento(precos);
		
		System.out.printf("Mais barato: ",nomes[pos]);
		
		sc.close();
	}
	
	/**
	 * Fun��o para entrada de dados no sistema
	 * @param nomes - armazena os nomes no vetor
	 * @param precos - armazena os pre�os no vetor
	 */
	public static void lerDados(String nomes[], double[] precos){
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		for(int i=0 ; i<nomes.length ; i++){
			
			nomes[i]=sc.next();
			precos[i]=sc.nextDouble();
		}
		sc.close();	
	}

	/**
	 * Fun��o para mostrar os nomes dos produtos
	 * cujo pre�o esteja entre 100 e 200
	 * @param nomes - vari�vel que ir� imprimir os nomes
	 * @param precos - vari�vel para comparar os pre�os
	 * @param min - vari�vel que traz o pre�o m�nimo
	 * @param max - vari�vel que traz o pre�o m�ximo
	 */
	public static void mostrarProdutoEntre(String nomes[], double[] precos, double min, double max){
		for(int i=0 ; i<nomes.length ; i++)
			if(precos[i]>=min && precos[i]<=max)
				System.out.println(nomes[i]);
	}
	
	/**
	 * Fun��o para localizar a posi��o do menor pre�o
	 * @param precos - traz os pre�os a serem comparados
	 * @return retorna a posic�o do menor elemento
	 */
	public static int posicaoMenorElemento(double[] precos){
		double aux=precos[1];
		int posicao=0;
		for(int i=1 ; i<precos.length ; i++)
			if(aux>precos[i]){
				aux=precos[i];
				posicao=i;
			}
		return posicao;
				
	}
}
