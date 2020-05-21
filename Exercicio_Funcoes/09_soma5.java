/*
+--------------------------+
|    Rodrigo CavanhaMan    |
|           IFTM           |
|  Sistemas para Internet  |
|                          |
|       EXERCICIO 9        |
+--------------------------+
*/
import java.util.Locale;
import java.util.Scanner;

public class soma5 {

	/**
	* Faz a leitura do vetor inteiro a partir da entrada padrao
	* @param vet Um vetor JA INSTANCIADO
	*/	public static void lervetor(double[] vet){
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		for(int i=0 ; i<vet.length ; i++)
			vet[i] = sc.nextDouble();
		
		sc.close();
	}

	
	/**
	* Altera o conteudo do vetor dado, somando o numero x a cada um
	* dos elementos do vetor
	* @param vet Um vetor ja preenchido com numeros
	* @param x Um valor numerico qualquer
	*/
	public static void somarValor(double[] vet, double x){
		for(int i=0 ; i<vet.length ; i++)
			vet[i] += x;
	}
	
	
	/**
	* Imprime o vetor dado na saida padrao
	* @param vet Um vetor ja preenchido com numeros
	*/
	public static void imprimirVetor(double[] vet){
		for(int i=0 ; i<vet.length ; i++)
			System.out.printf("%3.1f\n",vet[i]);

	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		double vet[], x=5.0;

		System.out.println("Quantos valores vc vai digitar?");
		int N = sc.nextInt();
		vet = new double[N];
		
		System.out.println("Forneça os valores do vetor:");
		lervetor(vet);
		
		somarValor(vet,x);
		
		System.out.println("Valores do vetor acrescidos de 5:");
		imprimirVetor(vet);
		
		sc.close();
	}

}
