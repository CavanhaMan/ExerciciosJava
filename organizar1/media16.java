/*
╔══════════════════════════╗
║    Rodrigo CavanhaMan    ║
║           IFTM           ║
║  Sistemas para Internet  ║
║                          ║
║       EXERCICIO 15       ║
╚══════════════════════════╝
*/
import java.util.Locale;
import java.util.Scanner;

public class media16 {

	/**
	* Calcula a media aritmetica entre quatro numeros
	* @param N1 Primeiro numero
	* @param N2 Segundo numero
	* @param N3 Terceiro numero
	* @param N4 Quarto numero
	* @return A media aritmetica dos numeros
	*/
	public static double mediaEntreQuatro(double N1, double N2, double N3, double N4){
		return (N1+N2+N3+N4)/4;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double Na, Nb, Nc, Nd, media;

		System.out.println("Digite o 1º número:");
		Na = sc.nextDouble();
		System.out.println("Digite o 2º número:");
		Nb = sc.nextDouble();
		System.out.println("Digite o 3º número:");
		Nc = sc.nextDouble();
		System.out.println("Digite o 4º número:");
		Nd = sc.nextDouble();

		media = mediaEntreQuatro(Na,Nb,Nc,Nd);
		
		System.out.printf("A média dos 4 números é: %.2f",media);
		
		sc.close();
	}

}
