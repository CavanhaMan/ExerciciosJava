/*---------------------*
| Rodrigo CavanhaMan   |
| Exercicio Avaliativo |
| 07                   |
*----------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String data = sc.nextLine();
		String d = data.substring(0,2);
		System.out.printf("Estamos no dia %s do mes.\n",d);
		sc.close();
	}
}