/*
╔══════════════════════════╗
║    Rodrigo CavanhaMan    ║
║           IFTM           ║
║  Sistemas para Internet  ║
║                          ║
║       EXERCICIO 11       ║
╚══════════════════════════╝
*/
import java.util.Locale;
import java.util.Scanner;

public class pares {

	
	/**
	* Faz a leitura do vetor inteiro a partir da entrada padrao
	* @param vet Um vetor JA INSTANCIADO
	*/	public static void levetor(int[] vet){
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		for(int i=0 ; i<vet.length ; i++)
			vet[i] = sc.nextInt();
		
		sc.close();
	}

	
	/**
	* Imprime na tela somente os valores pares do vetor
	* @param vet Um vetor ja preenchido com numeros
	*/
	public static void imprimePar(int[] vet){
		for(int i=0 ; i<vet.length ; i++)
			if (vet[i]%2 == 0)
				System.out.printf("%2d  ",vet[i]);
	}

	/**
	* Imprime na tela somente os valores negativos do vetor
	* @param vet Um vetor ja preenchido com numeros
	*/
	public static void imprimeNeg(int[] vet){
		for(int i=0 ; i<vet.length ; i++)
			if (vet[i] < 0)
				System.out.printf("%2d  ",vet[i]);
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		System.out.println("Quantos valores vc vai digitar?");
		int N = sc.nextInt();
	
		int[] vet = new int[N];
		
		
		System.out.println("\nForneça os valores do vetor:");
		levetor(vet);

		System.out.println("\nValores pares do vetor:");
		imprimePar(vet);

		System.out.println("\nValores negativos do vetor:");
		imprimeNeg(vet);

		sc.close();
	}

}
