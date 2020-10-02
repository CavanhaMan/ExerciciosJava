/*---------------------*
| Rodrigo CavanhaMan   |
| Exercicio Avaliativo |
| 03                   |
*----------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String texto = sc.nextLine();
		if (texto.length()<=10)
			System.out.println("pequeno");
		else
			System.out.println("grande");
		
		sc.close();
	}
}
