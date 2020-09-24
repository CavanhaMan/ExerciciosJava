/*-------------------------*
|    Rodrigo CavanhaMan    |
|           IFTM           |
|  Sistemas para Internet  |
|                          |
|       EXERCICIO 18       |
*--------------------------*/
import java.util.Locale;
import java.util.Scanner;

public class maiorde4_18 {

	public static int encontraMaior(int A, int B){
		if(A > B)
			return A;
		else if (B > A)
			return B;
		else
			return A;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		int n1, n2, n3, n4, maior;
		
		System.out.printf("Forneça o 1º número: ");
		n1 = sc.nextInt();
		System.out.printf("Forneça o 2º número: ");
		n2 = sc.nextInt();
		System.out.printf("Forneça o 3º número: ");
		n3 = sc.nextInt();
		System.out.printf("Forneça o 4º número: ");
		n4 = sc.nextInt();
		
		maior = encontraMaior(n1,n2);
		maior = encontraMaior(maior,n3);
		maior = encontraMaior(maior,n4);
		
		System.out.printf("O maior dentre os 4 números é: %d",maior);
		
		sc.close();
	}

}
