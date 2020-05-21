/*
+--------------------------+
|    Rodrigo CavanhaMan    |
|           IFTM           |
|  Sistemas para Internet  |
|                          |
|       EXERCICIO 19       |
+--------------------------+
*/
import java.util.Locale;
import java.util.Scanner;

public class retangulo19 {

	public static double calculaDiagonal(double base, double altura){
		return (base * base) + (altura * altura);
	}

	public static double calculaArea(double base, double altura){
		return base * altura;
	}
	
	public static double calculaPerimetro(double base, double altura){
		return 2*base + 2*altura;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		double b, a, diagonal, area, perimetro;
		
		System.out.printf("Forneça a base do retângulo: ");
		b = sc.nextDouble();
		System.out.printf("Forneça a altura do retângulo: ");
		a = sc.nextDouble();

		diagonal = calculaDiagonal(b,a);
		area = calculaArea(b,a);
		perimetro = calculaPerimetro(b,a);
		
		System.out.printf("A diagonal do retângulo é: %.2fm\n",diagonal);
		System.out.printf("A área do retângulo é: %.2fm²\n",area);
		System.out.printf("O perímetro do retângulo é: %.2f\n",perimetro);
		
		sc.close();
	}

}
