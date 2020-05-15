package aplicacao;
/*
+------------------+
|Rodrigo CavanhaMan|
|Exercicios em Java|
+------------------+
*/
import java.util.Scanner;
import java.util.Locale;

public class Exercicio2 {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Renda anual com salário:\n");
		System.out.printf("Qual sua escolaridade?\n");
		System.out.printf("%25s","1) Ensino Fundamental");
		System.out.printf("%25s","2) Ensino Médio\n");
		System.out.printf("%25s","3) Ensino Superior"); 
		System.out.printf("%25s","4) Pós-graduação\n");
		System.out.printf("Digite uma opção: 1\n");
		System.out.printf("Você tem quantos anos de experiência profissional?\n");
		System.out.printf("Você tem disponibilidade para viajar (S/N)?\n");
		System.out.printf("Você tem habilitação de motorista (S/N)?\n");

		
		
		
		
		float rSalario = sc.nextFloat();
		

		sc.close();
	}
}

/*
_________________________________________________________
Entrada de teste 1:
---------------------------------------------------------
1
10
S
S
---------------------------------------------------------
RESULTADO:
---------------------------------------------------------
Pontos por escolaridade: 10
Pontos por experiência: 40
Infelizmente seu perfil não atende a empresa 

_________________________________________________________
Entrada de teste 2:
---------------------------------------------------------
4
8
S
N
---------------------------------------------------------
RESULTADO:
---------------------------------------------------------
Pontos por escolaridade: 40
Pontos por experiência: 40
Você está habilitado para o(s) seguinte(s) cargo(s):
GERENTE
ANALISTA 
*/
/*
System.out.format("╔════════════════════════════════════════════════════════════╗%n");
		System.out.format("║                                                            ║█%n");
		System.out.format("║                                                            ║█%n");
		System.out.printf("║         Seja bem vindo ao nosso sistema telefônico!        ║█%n");
		System.out.format("║                                                            ║█%n");
		System.out.format("║                                                            ║█%n");
		System.out.format("╚════════════════════════════════════════════════════════════╝█%n");
		System.out.format(" ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀%n%n");
	
*/