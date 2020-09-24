/*
╔════════════════════╗
║ Rodrigo CavanhaMan ║
║        IFTM        ║
║  Exercicio Carlos  ║
╚════════════════════╝
*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Map<Character,Integer> tabelaHash = new HashMap<>();
		int contaVisitantes=0, entrada, controle=0;
		int N = sc.nextInt();
		int[] visitante = new int[N];
		for (int y=0 ; y<N ; y++){
			entrada = sc.nextInt(); 
			for (int i=0 ; i<visitante.length ; i++)
				if (entrada==visitante[i])
					controle=1;
			if (controle==0){
				visitante[y]=entrada;
			}
		}
		System.out.println(visitante.length);
		for (int i=0 ; i<visitante.length ; i++)
			System.out.printf("%d ",visitante[i]);
		sc.close();
	}

}