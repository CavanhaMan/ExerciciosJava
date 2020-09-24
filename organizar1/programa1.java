import java.util.Locale;
import java.util.Scanner;

public class programa1 {
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
			System.out.println("Menu de op��es:");
			System.out.println("1 � Mostrar �rea");
			System.out.println("2 � Mostrar per�metro");
			System.out.println("3 � Sair");
			System.out.print("Digite a op��o desejada: ");
			op = sc.nextInt();
			if (op == 1) {
				resposta = base * altura;
				System.out.println("Area = " + resposta);
			} else if (op == 2) {
				resposta = 2 * (base + altura);
				System.out.println("Perimetro = " + resposta);
			} else if (op == 3) {
				System.out.println("Fim do programa!");
			} else {
				System.out.println("Opcao invalida!");
			}
		}
		sc.close();
	}
}