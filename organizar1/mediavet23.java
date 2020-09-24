/*
╔══════════════════════════╗
║    Rodrigo CavanhaMan    ║
║           IFTM           ║
║  Sistemas para Internet  ║
║                          ║
║       EXERCICIO 23       ║
╚══════════════════════════╝
*/
import java.util.Locale;
import java.util.Scanner;

public class mediavet23 {

	/**
	 * Função para entrada de dados no vetor
	 * @param N - quantidade de elementos
	 * @return - devolve o vetor já preenchido
	 */
	public static int[] lerVetor(int N){
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		int[] vet = new int[N];

		for(int i=0 ; i<vet.length ; i++)
			vet[i] = sc.nextInt();
		return vet;
	}

	private static int fazMediaPos(int[] vet){
		int conta=0, soma=0;
		for(int i=0 ; i<vet.length ; i++)
			if (vet[i] > 0){
				soma+=vet[i];
				conta++;
			}
		return soma/conta;			
	}
	
	private static int contaNegativos(int[] vet){
		int contaneg=0;
		for(int i=0 ; i<vet.length ; i++)
			if (vet[i] < 0){
				contaneg++;
			}
		return contaneg;			
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		System.out.printf("Quantos valores serão digitados? ");
		int N = sc.nextInt();
		
		int[] vet = lerVetor(N);
		int media = fazMediaPos(vet);
		int negativos = contaNegativos(vet);
		
		System.out.printf("Média dos valores positivos: %d\n",media);
		System.out.printf("Quantidade de nº negativos: %d\n",negativos);
		
		sc.close();
	}

}
