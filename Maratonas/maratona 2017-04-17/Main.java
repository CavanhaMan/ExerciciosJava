import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, f1=0, f2=1, fn=0;

		n = sc.nextInt();
		
		for (int aux = 0; aux < n; aux++){
			System.out.printf("%d ",fn);
			fn = f1 + f2;
			f1 = f2;
			f2 = fn;
		}
		sc.close();
	}
}