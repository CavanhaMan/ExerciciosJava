/*-------------------------*
|    Rodrigo CavanhaMan    |
|           IFTM           |
|  Sistemas para Internet  |
|                          |
|       EXERCICIO 12       |
*--------------------------*/
import java.util.Locale;
import java.util.Scanner;

public class idade12 {
	
	public static void entraDados(String[] nome, int[] idade){
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		for(int i=0 ; i<nome.length ; i++){
			nome[i]=sc.next();
			idade[i]=sc.nextInt();
		}
	}

	public static void imprimePessoas(String[] nome, int[] idade){
		for(int i=0 ; i<nome.length ; i++)
			if (idade[i]>=12 && idade[i]<=20)
				System.out.println(nome[i]);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		System.out.println("Quantas pessoas vc vai informar?");
		int N = sc.nextInt();
		
		int[] idade = new int[N];
		String[] nome = new String[N];
		
		entraDados(nome,idade);
		
		System.out.println("Pessoas com idade entre 12 e 20");
		imprimePessoas(nome,idade);
			
		sc.close();
	}

}
