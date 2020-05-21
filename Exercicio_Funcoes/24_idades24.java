/*
+--------------------------+
|    Rodrigo CavanhaMan    |
|           IFTM           |
|  Sistemas para Internet  |
+--------------------------+
*/
import java.util.Locale;
import java.util.Scanner;

public class idades24 {

	public static void entraDados(String[] nome, int[] idade){
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		for(int i=0 ; i<nome.length ; i++){
			nome[i]=sc.next();
			idade[i]=sc.nextInt();
		}
	}

	private static int mostraMaiVelha(int[] idade){
		int velho=idade[0], posicao=0;
		for(int i=0 ; i<idade.length ; i++)
			if(velho < idade[i]){
				velho = idade[i];
				posicao=i;
			}
		return posicao;
	}
	
	private static double percentualMenor18(int[] idade){
		int conta18=0;
		for(int i=0 ; i<idade.length ; i++)
			if(idade[i]<18)
				conta18++;
		return conta18*100/idade.length;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		System.out.printf("Quantos nomes serão digitados? ");
		int N = sc.nextInt();
		
		int[] idade = new int[N];
		String[] nome = new String[N];

		entraDados(nome,idade);
		
		int maisvelha = mostraMaiVelha(idade);
		System.out.printf("A pessoa mais velha é: %s com %d anos.\n",nome[maisvelha],idade[maisvelha]);
		
		double percent18 = percentualMenor18(idade);
		System.out.printf("O percentual de pessoas com menos de 18 anos é: %.0f%%\n",percent18);
		
		sc.close();
	}

}
