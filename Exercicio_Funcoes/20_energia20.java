/*
+--------------------------+
|    Rodrigo CavanhaMan    |
|           IFTM           |
|  Sistemas para Internet  |
|                          |
|       EXERCICIO 20       |
+--------------------------+
*/
import java.util.Locale;
import java.util.Scanner;

public class energia20 {

	public static double calculaConta(double energia){
		if (energia <= 45)
			return 20.00;
		else
			return 20.00 + (energia-45)*0.50;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		/*valor básico: 20 reais até 45kw/h
		 * para cada kw/h a amis é cobrado 0,50  */
		
		double kwh, conta;
		
		System.out.printf("Forneça o valor de KW/h consumidos no mês: ");
		kwh = sc.nextDouble();

		conta = calculaConta(kwh);
		
		System.out.printf("O valor a ser pago no mês é: R$%.2f",conta);
		
		sc.close();
	}

}
