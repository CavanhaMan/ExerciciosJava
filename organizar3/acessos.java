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
		Map<Character,Integer> tabelaHash = new HashMap<>();
		while(N>=0){
			visitante = sc.nextLine(); 
			char[] visit = visitante.toCharArray();
			for (int i=0 ; i<visit.length ; i++)
				tabelaHash.put(visit[i],0);
			N--;
		}
		System.out.println(tabelaHash.size());
		sc.close();
	}

}