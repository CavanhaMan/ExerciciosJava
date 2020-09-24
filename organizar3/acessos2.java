/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|  Exercicio Carlos  |
*--------------------*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String visitante;
		int N = sc.nextInt();
		char[] visit = new char[N];
		Map<Character,Integer> tabelaHash = new HashMap<>();
		for (int y=0 ; y<=N ; y++){
			visitante = sc.nextLine(); 
			visit = visitante.toCharArray();
			for (int i=0 ; i<visit.length ; i++)
				tabelaHash.put(visit[i],0);
		}
		System.out.println(tabelaHash.size());
		sc.close();
	}

}