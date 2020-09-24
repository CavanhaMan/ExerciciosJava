package aplicacao;
/*-----------------*
|Rodrigo CavanhaMan|
|Exercicios em Java|
*------------------*/
import java.util.Scanner;
import java.util.Locale;
public class Exercicio1_2 {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		/** RENDAS *********/
		System.out.format("┌─────────────────────────────────────────────────┐%n");
		System.out.printf("│ Renda anual com salário:                        │\n");
		System.out.format("└─────────────────────────────────────────────────┘%n");
		float rSalario = sc.nextFloat();
		System.out.format("┌─────────────────────────────────────────────────┐%n");
		System.out.printf("│ Renda anual com prestação de serviço:           │\n");
		System.out.format("└─────────────────────────────────────────────────┘%n");
		float rServico = sc.nextFloat();
		System.out.format("┌─────────────────────────────────────────────────┐%n");
		System.out.printf("│ Renda anual com ganho de capital:               │\n");
		System.out.format("└─────────────────────────────────────────────────┘%n");
		float rCapital = sc.nextFloat();
		
		/** GASTOS *********/
		System.out.format("┌─────────────────────────────────────────────────┐%n");
		System.out.printf("│ Gastos médicos:                                 │\n");
		System.out.format("└─────────────────────────────────────────────────┘%n");
		float gMedicos = sc.nextFloat();
		System.out.format("┌─────────────────────────────────────────────────┐%n");
		System.out.printf("│ Gastos educacionais:                            │\n");
		System.out.format("└─────────────────────────────────────────────────┘%n");
		float gEducacao = sc.nextFloat();
		float gTotal = gMedicos + gEducacao;
		
		System.out.format("╔═════════════════════════════════════════════════╗%n");
		System.out.printf("║          RELATÓRIO DE IMPOSTO DE RENDA          ║█\n");
		System.out.printf("╠═════════════════════════════════════════════════╣█\n");
		System.out.printf("║ CONSOLIDADO DE RENDA:                           ║█\n");
		System.out.printf("╠─────────────────────────────────────────────────╣█\n");
		
		/** IMPOSTO SOBRE SALARIO *********/
		float iSalario=0;
		float salMes=rSalario/12;
		if (salMes <= 3000) iSalario = 0;
		else if(salMes > 3000 && salMes < 5000) iSalario = rSalario*10/100;
		else if(salMes >= 5000) iSalario = rSalario*20/100;
		if (iSalario == 0) 
			System.out.printf("║   Imposto sobre salário: Isento                 ║█\n");
		else
			System.out.printf("║   Imposto sobre salário: %22.2f ║█\n",iSalario);
		
		/** IMPOSTO SOBRE SERVIÇOS *********/
		float iServico=0;
		if (rServico > 0)
			iServico = rServico*15/100;
		System.out.printf("║   Imposto sobre serviços: %21.2f ║█\n", iServico);
		
		/** IMPOSTO SOBRE GANHOS DE CAPITAL *********/
		float iCapital=0;
		if (rCapital > 0)
			iCapital = rCapital*20/100;
		System.out.printf("║   Imposto sobre ganho de capital: %13.2f ║█\n", iCapital);
		
		float iTotal = iSalario+iServico+iCapital;

		System.out.printf("╠═════════════════════════════════════════════════╣█\n");
		/** DEDUÇÕES *********/
		System.out.printf("║ DEDUÇÕES:                                       ║█\n");
		float maxDedutivel = iTotal*30/100;
		System.out.printf("╠─────────────────────────────────────────────────╣█\n");
		System.out.printf("║   Máximo dedutível: %27.2f ║█\n", maxDedutivel);
		System.out.printf("║   Gastos dedutíveis: %26.2f ║█\n", gTotal);
		
		/** RESUMO *********/
		System.out.printf("╠═════════════════════════════════════════════════╣█\n");
		System.out.printf("║ RESUMO:                                         ║█\n");
		System.out.printf("║   Imposto bruto total: %24.2f ║█\n", iTotal);
		if(gTotal > maxDedutivel) gTotal = maxDedutivel;
		System.out.printf("║   Abatimento: %33.2f ║█\n", gTotal);
		System.out.printf("║   Imposto devido: %29.2f ║█\n", iTotal-gTotal);

		System.out.format("╚═════════════════════════════════════════════════╝█%n");
		System.out.format(" ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀%n");


		sc.close();
	}
}
/*
_________________________________________
Valores de teste 1:
-----------------------------------------
48000.00
0.00
800.00
400.00
5400.00
-----------------------------------------
Resultados 1:
-----------------------------------------
RELATÓRIO DE IMPOSTO DE RENDA
CONSOLIDADO DE RENDA:
Imposto sobre salário: 4800.00
Imposto sobre serviços: 0.00
Imposto sobre ganho de capital: 160.00
DEDUÇÕES:
Máximo dedutível: 1488.00
Gastos dedutíveis: 5800.00
RESUMO:
Imposto bruto total: 4960.00
Abatimento: 1488.00
Imposto devido: 3472.00


_________________________________________
Valores de teste 2:
-----------------------------------------
189000.00
55184.93
20000.00
600.00
7500.00
-----------------------------------------
Resultados 2:
-----------------------------------------
RELATÓRIO DE IMPOSTO DE RENDA
CONSOLIDADO DE RENDA:
Imposto sobre salário: 37800.00
Imposto sobre serviços: 8277.74
Imposto sobre ganho de capital: 4000.00
DEDUÇÕES:
Máximo dedutível: 15023.32
Gastos dedutíveis: 8100.00
RESUMO:
Imposto bruto total: 50077.74
Abatimento: 8100.00
Imposto devido: 41977.74 

*/