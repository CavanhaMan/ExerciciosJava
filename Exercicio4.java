package aplicacao;
/*
+------------------+
|Rodrigo CavanhaMan|
|Exercicios em Java|
+------------------+
*/
import java.util.Scanner;
import java.util.Locale;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite a largura do retangulo: ");
		float largura = sc.nextFloat();
		while (largura <= 0) {
			System.out.printf("O valor deve ser positivo. Tente novamente: ");
			largura = sc.nextFloat();
		}
		System.out.printf("Digite a altura do retangulo:\n");
		float altura = sc.nextFloat();
		while (altura <= 0) {
			System.out.printf("O valor deve ser positivo. Tente novamente: ");
			altura = sc.nextFloat();
		}
		System.out.println();

		while(true) {
			int escolha=0;
			System.out.printf("\nMENU:\n");
			System.out.printf("1 - Mostrar area\n");
			System.out.printf("2 - Mostrar perimetro\n");
			System.out.printf("3 - Sair\n");
			System.out.printf("Digite uma opcao: ");
			escolha = sc.nextInt();
			
			if (escolha==1)
				System.out.printf("\nAREA = %.2f\n", altura*largura);
			
			else if (escolha==2)
				System.out.printf("\nPERIMETRO = %.2f\n", 2*(altura+largura));
			
			else if (escolha==3) {
				System.out.printf("\nFIM DO PROGRAMA!\n");
				break;
			}
			else {
				System.out.println("\nOPCAO INVALIDA");
			}
		}
		sc.close();
	}
}
/*

 */
