import java.util.*;

public class maratona {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, tempo, pena=0, soma=0, maiorT=0;
		String jogador="", maiorJ="";
		n = sc.nextInt();
		
		for(int aux = n; aux > 0; aux--){
			jogador = sc.next();
			tempo = sc.nextInt();
			pena = sc.nextInt();  
			soma = tempo + pena;

			if (soma > maiorT){
				maiorT = soma;
				maiorJ = jogador;
			}
		}
		System.out.println(maiorJ);
		System.out.println(maiorT);

		sc.close();
	}
}