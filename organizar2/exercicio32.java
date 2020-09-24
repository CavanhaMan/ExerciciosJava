import java.util.Scanner;

	public class exercicio32 {

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);

			int x, y, soma=0;
			
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (x > y){
				int aux = x;
				x = y;
				y = aux;
			}
			
			while (x <= y){
				if (x % 2 != 0){
					soma = soma + x;
				}
				x++;
			}
			System.out.println(soma);

			sc.close();
		}
	}
