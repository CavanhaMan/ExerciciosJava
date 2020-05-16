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
		
		System.out.printf("Renda anual com salário:");
		float salario = sc.nextFloat();
		System.out.printf("Qual sua escolaridade?\n");
		System.out.printf("   1) Ensino Fundamental");
		System.out.printf("   2) Ensino Médio      \n");
		System.out.printf("   3) Ensino Superior   "); 
		System.out.printf("   4) Pós-graduação     \n");
		System.out.printf("   Digite uma opção: ");
		int escolaridade = sc.nextInt();
		System.out.printf("Você tem quantos anos de experiência profissional? ");
		double experiencia = sc.nextDouble();
		System.out.printf("Você tem disponibilidade para viajar (S/N)? ");
		char viajar = sc.next().charAt(0);
		System.out.printf("Você tem habilitação de motorista (S/N)? ");
		char motorista = sc.next().charAt(0);
		
		int pEscolaridade=0;
		if (escolaridade == 1) pEscolaridade=10;     	//fundamental
		else if (escolaridade == 2) pEscolaridade=20;	//ensino médio 
		else if (escolaridade == 3) pEscolaridade=30;	//superior
		else if (escolaridade == 4) pEscolaridade=40;	//pos-graduacao
		System.out.printf("Pontos por escolaridade: %d\n", pEscolaridade);
		
		int pExperiencia=0;
		if (experiencia == 0) pExperiencia = 0;							//0
		else if (experiencia <= 2) pExperiencia = 10;					//ate 2
		else if (experiencia > 2 && experiencia <=5) pExperiencia = 20;	//2-5
		else if (experiencia >5) pExperiencia = 40;						//acima 5
		System.out.printf("Pontos por experiência: %d\n", pExperiencia);
		
		/* Assistentes precisam ter pelo menos ensino médio, e habilitação de motorista.*/
		/*Gerentes precisam ter acima de 2 anos de experiência e pelo menos ensino superior./
		/*Analistas precisam ter acima de 5 anos de experiência, disponibilidade para viajar, e pelo menos ensino superior.*/
		System.out.println("Você está habilitado para o(s) seguinte(s) cargo(s):");
		if (pEscolaridade>=20 && (motorista == 'S' || motorista =='s')) System.out.println("ASSISTENTE");
		else if (pEscolaridade>=30 && experiencia > 2) System.out.println("GERENTE");
		else if (pEscolaridade>=30 && experiencia > 5 && (viajar=='s' || viajar=='S')) System.out.println("ANALISTAS");
		else System.out.println("Infelizmente seu perfil não atende a empresa");
		
		
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
