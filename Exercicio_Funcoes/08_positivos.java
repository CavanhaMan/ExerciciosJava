/*-------------------------*
|    Rodrigo CavanhaMan    |
|           IFTM           |
|  Sistemas para Internet  |
|                          |
|       EXERCICIO 8        |
*--------------------------*/
import java.util.Locale;
import java.util.Scanner;

public class positivos {

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
	* Imprime na tela somente os valores positivos do vetor
	* @param vet Um vetor ja preenchido com numeros
	*/
	public static void imprimirPositivos(double[] vet){
		for(int i=0 ; i<vet.length ; i++)
			if (vet[i] > 0.0)
				System.out.printf("%2.1f  ",vet[i]);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		double vet[]; 

		System.out.println("Quantos valores vc vai digitar?");
		int N = sc.nextInt();
		vet = new double[N];
		
		System.out.println("Forneça os valores do vetor:");
		lervetor(vet);
		
		System.out.println("Valores positivos do vetor:");
		imprimirPositivos(vet);
		
		sc.close();
	}

}
