/*
+------------------+
|Rodrigo CavanhaMan|
|Exercicios em Java|
+------------------+
*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		float imposto;
		float salario = sc.nextFloat();
		
		if (salario <= 3000) imposto = 0;
		
		
		System.out.println("Renda anual com salário:");
		float rSalario = sc.nextFloat();
		System.out.println("Renda anual com prestação de serviço:");
		float rServico = sc.nextFloat();
		System.out.println("Renda anual com ganho de capital:");
		float rCapital = sc.nextFloat();
		System.out.println("Gastos médicos:");
		float gMedicos = sc.nextFloat();
		System.out.println("Gastos educacionais:");
		float gEducacao = sc.nextFloat();
		
		System.out.println("\nRELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println("\nCONSOLIDADO DE RENDA:");
		System.out.println("Imposto sobre salário:");
		System.out.println("Imposto sobre serviços:");
		System.out.println("Imposto sobre ganho de capital:");
		
		System.out.println("\nDEDUÇÕES:");
		System.out.println("Máximo dedutível:");
		System.out.println("Gastos dedutíveis:");
		
		System.out.println("\nRESUMO:");
		System.out.println("Imposto bruto total:");
		System.out.println("Abatimento:");
		System.out.println("Imposto devido:");
		

		sc.close();
	}
}

