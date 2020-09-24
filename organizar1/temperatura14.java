/*
╔══════════════════════════╗
║    Rodrigo CavanhaMan    ║
║           IFTM           ║
║  Sistemas para Internet  ║
║                          ║
║       EXERCICIO 14       ║
╚══════════════════════════╝
*/
import java.util.Locale;
import java.util.Scanner;

public class temperatura14 {

	/**
	* Converte uma temperatura de Fahrenheit para Celsius
	* @param F Uma medida de temperatura em Fahrenheit
	* @return A temperatura correspondente em Celsius
	*/
	public static double fahrenheitParaCelsius(double F){
		return 5.0 / 9.0 * (F - 32);
	}
	
	/**
	* Converte uma temperatura de Celsius para Fahrenheit
	* @param F Uma medida de temperatura em Fahrenheit
	* @return C temperatura correspondente em Celsius
	*/
	public static double celsiusparaFahrenheit(double C){
		return C * 1.8 + 32.0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		int escolha;
		double tempF, tempC;
		
		System.out.println("Escolha a conversão:");
		System.out.println("1 - Fahrenheit para Celsius");
		System.out.println("2 - Celsius para Fahrenheit");
		escolha = sc.nextInt();
		
		if(escolha == 1){
			System.out.println("Forneça a temperatura em Fahrenheit:");
			tempF = sc.nextDouble();
			tempC = fahrenheitParaCelsius(tempF);
			System.out.printf("Temperatura em Celsius: %.2f",tempC);
		}
		
		if(escolha == 2){
			System.out.println("Forneça a temperatura em Celsius:");
			tempC = sc.nextDouble();
			tempF = celsiusparaFahrenheit(tempC);
			System.out.printf("Temperatura em Fahrenheit: %.2f",tempF);
		}
		sc.close();
	}

}
