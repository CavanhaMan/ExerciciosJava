package projeto01;
/*---------------------*
| Rodrigo CavanhaMan   |
| Exercicio Avaliativo |
| 01                   |
*----------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String A = sc.nextLine();
		String B = sc.nextLine();
		if (A.equals(B))
			System.out.println("correto");
		else
			System.out.println("incorreto");
		
		sc.close();
	}
}
