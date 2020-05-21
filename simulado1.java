/*
+--------------------+
¦ Rodrigo CavanhaMan ¦
¦        IFTM        ¦
¦ Simulado Prova Ex4 ¦
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
	 * Função para entrada de dados no sistema
	 * @param nomes - armazena os nomes no vetor
	 * @param precos - armazena os preços no vetor
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
	 * Função para mostrar os nomes dos produtos
	 * cujo preço esteja entre 100 e 200
	 * @param nomes - variável que irá imprimir os nomes
	 * @param precos - variável para comparar os preços
	 * @param min - variável que traz o preço mínimo
	 * @param max - variável que traz o preço máximo
	 */
	public static void mostrarProdutoEntre(String nomes[], double[] precos, double min, double max){
		for(int i=0 ; i<nomes.length ; i++)
			if(precos[i]>=min && precos[i]<=max)
				System.out.println(nomes[i]);
	}
	
	/**
	 * Função para localizar a posição do menor preço
	 * @param precos - traz os preços a serem comparados
	 * @return retorna a posicão do menor elemento
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
