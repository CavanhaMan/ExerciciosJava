package aplicacao;
/*
+------------------+
|Rodrigo CavanhaMan|
|Exercicios em Java|
|  COM  INTERFACE  |
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
			System.out.println();
			System.out.format("╔═══════════════════════════╗%n");
			System.out.printf("║ MENU:                     ║█\n");
			System.out.printf("╠═══════════════════════════╣█\n");
			System.out.printf("║   1 - Mostrar area        ║█\n");
			System.out.printf("║   2 - Mostrar perimetro   ║█\n");
			System.out.printf("║   3 - Sair                ║█\n");
			System.out.printf("╠═══════════════════════════╣█\n");
			System.out.printf("║ Digite uma opcao:         ║█\n");
			System.out.format("╚═══════════════════════════╝█%n");
			System.out.format(" ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀%n%n");
			escolha = sc.nextInt();
			
			if (escolha==1) {
				System.out.format("╔═══════════════════════════╗%n");
				System.out.printf("║ AREA = %18.2f ║█\n", altura*largura);
				System.out.format("╚═══════════════════════════╝█%n");
				System.out.format(" ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
			}
			else if (escolha==2) {
				System.out.format("╔═══════════════════════════╗%n");
				System.out.printf("║ PERIMETRO = %13.2f ║█\n", 2*(altura+largura));
				System.out.format("╚═══════════════════════════╝█%n");
				System.out.format(" ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
			}
			else if (escolha==3) {
				System.out.format("╔═══════════════════════════╗%n");
				System.out.printf("║      FIM DO PROGRAMA!     ║█\n");
				System.out.format("╚═══════════════════════════╝█%n");
				System.out.format(" ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
				break;
			}
			else {
				System.out.format("╔═══════════════════════════╗%n");
				System.out.printf("║      OPCAO  INVALIDA      ║█\n");
				System.out.format("╚═══════════════════════════╝█%n");
				System.out.format(" ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
			}
		}
		sc.close();
	}
}