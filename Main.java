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
		
		
		System.out.println("Renda anual com sal�rio:");
		float rSalario = sc.nextFloat();
		System.out.println("Renda anual com presta��o de servi�o:");
		float rServico = sc.nextFloat();
		System.out.println("Renda anual com ganho de capital:");
		float rCapital = sc.nextFloat();
		System.out.println("Gastos m�dicos:");
		float gMedicos = sc.nextFloat();
		System.out.println("Gastos educacionais:");
		float gEducacao = sc.nextFloat();
		
		System.out.println("\nRELAT�RIO DE IMPOSTO DE RENDA");
		System.out.println("\nCONSOLIDADO DE RENDA:");
		System.out.println("Imposto sobre sal�rio:");
		System.out.println("Imposto sobre servi�os:");
		System.out.println("Imposto sobre ganho de capital:");
		
		System.out.println("\nDEDU��ES:");
		System.out.println("M�ximo dedut�vel:");
		System.out.println("Gastos dedut�veis:");
		
		System.out.println("\nRESUMO:");
		System.out.println("Imposto bruto total:");
		System.out.println("Abatimento:");
		System.out.println("Imposto devido:");
		

		sc.close();
	}
}

