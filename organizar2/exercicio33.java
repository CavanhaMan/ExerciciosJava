import java.util.Scanner;

	public class exercicio33 {

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);

			float x, y, divide;
			
			x = sc.nextFloat();
			y = sc.nextFloat();
			
			if (y == 0.0){
				System.out.println("nao existe");
			}
			else {
				divide = x / y;
				System.out.printf("%.3f\n",divide);
			}
			sc.close();
		}
	}
