/*-------------------------*
|    Rodrigo CavanhaMan    |
|           IFTM           |
|  Sistemas para Internet  |
*--------------------------*/
import java.util.Locale;
import java.util.Scanner;

public class programa2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		double base, altura, resposta;
		int op;
		System.out.print("Digite o valor da base: ");
		base = sc.nextDouble();
		System.out.print("Digite o valor da altura: ");
		altura = sc.nextDouble();
		op = 0;
		while (op != 3) {
			mostrarMenu();
			op = sc.nextInt();
			tratarMenu(op, base, altura);
		}
		sc.close();
	}


	public static void mostrarMenu() {
		System.out.println("Menu de opções:");
		System.out.println("1 – Mostrar área");
		System.out.println("2 – Mostrar perímetro");
		System.out.println("3 – Sair");
		System.out.print("Digite a opção desejada: ");
	}

	public static void tratarMenu(int op, double base, double altura) {
		double resposta;
		if (op == 1) {
			resposta = base * altura;
			System.out.println("Area = " + resposta);
		}
		else if (op == 2) {
			resposta = 2 * (base + altura);
			System.out.println("Perimetro = " + resposta);
		}
		else if (op == 3) {
			System.out.println("Fim do programa!");
		}
		else {
			System.out.println("Opcao invalida!");
		}
	}
}
