import java.util.Scanner;

public class veloc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, velocidade, tempo, milhas=0, tempoanterior=0, soma=0;
		n = sc.nextInt();
		
while (n != -1){
		if (n == -1){
			break;
		}
		else if (n == 1){
			velocidade = sc.nextInt();
			tempo = sc.nextInt();
			milhas = velocidade * tempo;
			System.out.printf("%d milhas\n",milhas);
		}
		else if (n >1){

			for(int aux = n; aux > 0; aux--){
				velocidade = sc.nextInt();
				tempo = sc.nextInt();
				milhas = velocidade * (tempo-tempoanterior);
				tempoanterior = tempo;
				soma+=milhas;
			}
		}
		System.out.printf("%d milhas\n",soma);
		milhas=0;
		tempoanterior=0;
		soma=0;
		velocidade=0;
		tempo=0;
		n = sc.nextInt();
}
		sc.close();
	}
}