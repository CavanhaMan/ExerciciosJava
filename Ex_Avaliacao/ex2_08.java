/*---------------------*
| Rodrigo CavanhaMan   |
| Exercicio Avaliativo |
| 08                   |
*----------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String T = sc.nextLine();
		String S = sc.nextLine();
		String[] newT = T.split(" ");
		int N=0;
		for (int i=0 ; i<newT.length ; i++)
			if (newT[i].contains(S)) N++;
		System.out.println(N);
		
		sc.close();
	}
}
//A mana da ana comeu banana com a joana
//O simao irmao do salomao, jogador do timao, tomou suco de limao com mamao.
