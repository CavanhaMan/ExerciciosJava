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

public class moeda15 {

	/**
	* Realiza a conversao de real para dolar
	* @param reais Um valor em reais
	* @param cambio O valor da cotacao do dolar
	* @return O valor correspondente em dolar
	*/
	public static double realParaDolar(double reais, double cambio){
		return reais * cambio;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		double real, camb, dolar;
		
		System.out.println("Forneça o valor em Reais:");
		real = sc.nextDouble();
		System.out.println("Forneça o valor do cambio:");
		camb = sc.nextDouble();
		
		dolar = realParaDolar(real,camb);
		
		System.out.printf("Valor em dólar: %.4f", dolar);

		sc.close();
	}
}
