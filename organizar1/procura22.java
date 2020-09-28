/*-------------------------*
|    Rodrigo CavanhaMan    |
|           IFTM           |
|  Sistemas para Internet  |
|                          |
|       EXERCICIO 22       |
*--------------------------*/
import java.util.Locale;
import java.util.Scanner;

public class procura22 {

	/**
	 * Funcao para entrada de dados no vetor
	 * @param N - quantidade de elementos
	 * @return - devolve o vetor ja preenchido
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
	
	/**
	* Realiza a busca de um elemento x no vetor
	* @param vet Um vetor ja preenchido
	* @param x Um valor a ser procurado
	* @return A primeira ocorrencia de x no vetor.
	* Se o valor x nao existir, retorna -1
	*/
	public static int busca(int[] vet, int x){
		for(int i=0 ; i<vet.length ; i++)
			if (vet[i] == x)
				return i;
		return -1;
	}

	public static int busca2(int[] vet, int x){
		int pos = -1;
		for(int i=0 ; i<vet.length ; i++){
			if (vet[i] == x){
				pos = i;
				break;
			}
		}
		return pos;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		System.out.printf("Quantos valores serao digitados? ");
		int N = sc.nextInt();
		int[] vet = lerVetor(N);

		System.out.printf("Qual o valor deseja buscar? ");
		int x = sc.nextInt();
		
		int P = busca(vet,x);
		
		if(P == -1)
			System.out.printf("Numero nao encontrado!");
		else
			System.out.printf("Numero encontrado na posicao %d.",P);
		
		
		sc.close();
	}

}
