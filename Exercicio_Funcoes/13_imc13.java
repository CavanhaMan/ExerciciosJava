/*-------------------------*
|    Rodrigo CavanhaMan    |
|           IFTM           |
|  Sistemas para Internet  |
|                          |
|       EXERCICIO 13       |
*--------------------------*/
import java.util.Locale;
import java.util.Scanner;

public class imc13 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double altura=0, peso=0, imc_result;
		
		System.out.println("Digite a altura:");
		altura = sc.nextDouble();
		System.out.println("Digite o peso:");
		peso   = sc.nextDouble();

		imc_result = calculaIMC(altura,peso);

		System.out.printf("IMC: %.2f\n",imc_result);
			
		sc.close();

	}
	
	/**
	* Calcula o IMC de uma pessoa
	* @param peso Uma medida de peso em kg
	* @param altura Uma medida de altura em metros
	* @return O IMC calculado
	*/
	public static double calculaIMC(double altura, double peso){
		double imc;
		imc = peso / (altura * altura);		
		return imc;
	}
	
}