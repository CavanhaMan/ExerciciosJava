package projeto01;
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
		
		/** RENDAS *********/
		System.out.printf("Renda anual com salário:");
		float rSalario = sc.nextFloat();
		System.out.printf("Renda anual com prestação de serviço:");
		float rServico = sc.nextFloat();
		System.out.printf("Renda anual com ganho de capital:");
		float rCapital = sc.nextFloat();
		float rTotal = rSalario + rServico + rCapital;
		
		/** GASTOS *********/
		System.out.printf("Gastos médicos:");
		float gMedicos = sc.nextFloat();
		System.out.printf("Gastos educacionais:");
		float gEducacao = sc.nextFloat();
		float gTotal = gMedicos + gEducacao;
		
		System.out.println("\n\nRELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println("\nCONSOLIDADO DE RENDA:");
		
		/** IMPOSTO SOBRE SALARIO *********/
		float iSalario=0;
		float salMes=rSalario/12;
		if (salMes <= 3000) iSalario = 0;
		else if(salMes > 3000 && salMes < 5000) iSalario = rSalario*10/100;
		else if(salMes >= 5000) iSalario = rSalario*20/100;
		if (iSalario == 0) 
			System.out.println("Imposto sobre salário: Isento");
		else
			System.out.printf("Imposto sobre salário: %.2f\n",iSalario);
		
		/** IMPOSTO SOBRE SERVIÇOS *********/
		float iServico=0;
		if (rServico > 0)
			iServico = rServico*15/100;
		
		System.out.printf("Imposto sobre serviços: %.2f\n", iServico);
		
		/** IMPOSTO SOBRE GANHOS DE CAPITAL *********/
		float iCapital=0;
		if (rCapital > 0)
			iCapital = rCapital*20/100;
		
		System.out.printf("Imposto sobre ganho de capital: %.2f\n", iCapital);
		
		float iTotal = iSalario+iServico+iCapital;

		/** DEDUÇÕES *********/
		System.out.println("\nDEDUÇÕES:");
		float maxDedutivel = iTotal*30/100;
		System.out.printf("Máximo dedutível: %.2f\n", maxDedutivel);
		System.out.printf("Gastos dedutíveis: %.2f\n", gTotal);
		
		/** RESUMO *********/
		System.out.println("\nRESUMO:");
		System.out.printf("Imposto bruto total: %.2f\n", iTotal);
		if(gTotal > maxDedutivel) gTotal = maxDedutivel;
		System.out.printf("Abatimento: %.2f\n", gTotal);
		System.out.printf("Imposto devido: %.2f\n", iTotal-gTotal);
		

		sc.close();
	}
}