import java.util.Scanner;

public class triplo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, triplox;
		
		System.out.println("Informe um número inteiro");
		x = sc.nextInt();

		triplox = x * 3;

		System.out.println("O triplo do valor informado é: " + triplox);

	
		sc.close();
	}

}
