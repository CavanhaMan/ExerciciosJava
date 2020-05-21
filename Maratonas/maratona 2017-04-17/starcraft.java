import java.util.Scanner;

public class starcraft {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, vitoria, soma=0;
		n = sc.nextInt();
		
		for(int aux = n; aux > 0; aux--){
			vitoria = sc.nextInt();
			soma+=vitoria;
		}
		System.out.println(soma);
		sc.close();
	}
}