/*
+--------------------------+
|    Rodrigo CavanhaMan    |
|           IFTM           |
|  Sistemas para Internet  |
|                          |
|       EXERCICIO 9        |
+--------------------------+
*/
import java.util.Locale;
import java.util.Scanner;

public class tabuada {

	/**
	 * Função para a entrada de dados da tabuada
	 * @param N - o valor desejado para a tabuada
	 * @param in - o valor inicial da tabuada
	 * @param fim - o valor final da tabuada
	 */
	public static void  entrada(){
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		int N = 1, in, fim;

		while(N!=0){
			System.out.println("(Digite zero para sair)");
			System.out.println("Que número quer fazer a tabuada?");
			N = sc.nextInt();
			if (N==0){
				System.out.println("FIM");
				sc.close();
			}
			else{
				System.out.println("Qual o valor inicial?");
				in = sc.nextInt();
				System.out.println("Qual o valor final?");
				fim = sc.nextInt();
				tabuadaa(N, in, fim);
			}
		}
		sc.close();
	}

	/**
	 * Imprime na tela a tabuada de multiplicação de um valor N
	 * para o intervalo de início até fim
	 * @param vr - o valor desejado para a tabuada
	 * @param i - o valor inicial da tabuada
	 * @param f - o valor final da tabuada
	 */
	public static void  tabuadaa(int vr, int i, int f){
		for(int x=i ; x<=f ; x++)
			System.out.printf("%2d * %2d = %2d\n", vr, x, vr*x);
	}
	
	
	public static void main(String[] args) {
	
		entrada();
	
	}

}
