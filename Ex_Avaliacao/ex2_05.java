package projeto01;
/*---------------------*
| Rodrigo CavanhaMan   |
| Exercicio Avaliativo |
| 05                   |
*----------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String frase = sc.nextLine();
		if (frase.length()<=5)
			System.out.println("invalida");
		else {
			char[] fr = frase.toCharArray();
			if (fr[0]==fr[fr.length-1])
				System.out.println("iguais");
			else
				System.out.println("diferentes");
		}
		
		sc.close();
	}
}
