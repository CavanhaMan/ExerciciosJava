import java.util.Scanner;
//import java.math.*;

public class quadrados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double n = sc.nextInt();
		
		while (n != 0){
			n = Math.pow(n, 2);
			System.out.printf("%.0f\n",n);
			n = sc.nextInt();
		}
		sc.close();
	}
}