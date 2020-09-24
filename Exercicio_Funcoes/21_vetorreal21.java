/*-------------------------*
|    Rodrigo CavanhaMan    |
|           IFTM           |
|  Sistemas para Internet  |
|                          |
|       EXERCICIO 21       |
*--------------------------*/
import java.util.Locale;
import java.util.Scanner;

public class vetorreal21 {

	/**
	* Faz a leitura de um vetor inteiro a partir da entrada padrao
	* @param N A quantidade desejada de elementos a serem lidos
	* @return O vetor contendo os valores lidos
	*/
	public static double[] nextVetor(int N){
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		double[] vet = new double[N];

		for(int i=0 ; i<vet.length ; i++)
			vet[i] = sc.nextDouble();
		return vet;
	}
	
	/**
	* Calcula a soma dos valores de um vetor de numeros
	* @param vet Um vetor ja preenchido com numeros
	* @return A soma dos valores
	*/
	public static double soma(double[] vet){
		double soma=0;
		for(int i=0 ; i<vet.length ; i++)
			soma+=vet[i];
		return soma;
	}
	
	/**
	* Calcula a media aritmetica dos valores de um vetor de numeros
	* @param vet Um vetor ja preenchido com numeros
	* @return A media aritmetica dos valores
	*/
	public static double media(double[] vet){
		int conta=0;
		double soma=0;
		for(int i=0 ; i<vet.length ; i++){
			soma+=vet[i];
			conta++;
		}
		return soma/conta;
	}
	
	/**
	* Encontra a posição o maior elemento de um vetor de numeros
	* @param vet Um vetor ja preenchido com numeros
	* @return A posição do maior elemento do vetor
	*/
	public static int maiorElemento(double[] vet){
		int posicao=0;
		double maior=vet[1];
		for(int i=0 ; i<vet.length ; i++)
			if(maior < vet[i]){
				maior = vet[i];
				posicao=i;
			}
		return posicao;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));


		int N;
		System.out.printf("Quantos valores serão digitados? ");
		N = sc.nextInt();

		double[] vet = nextVetor(N);
		double S = soma(vet);
		double Me = media(vet);
		int Ma = maiorElemento(vet);
		
		System.out.printf("Soma dos valores: %.2f\n",S);
		System.out.printf("Média dos valores: %.2f\n",Me);
		System.out.printf("Maior dos valores que está na posição %d é: %.2f\n",Ma,vet[Ma]);

		sc.close();
	}

}