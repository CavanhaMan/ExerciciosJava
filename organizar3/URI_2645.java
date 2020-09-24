/*
╔════════════════════╗
║ Rodrigo CavanhaMan ║
║        IFTM        ║
║      URI 2645      ║
╚════════════════════╝
*/
import java.util.Scanner;

public class URI_2645 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n  = sc.nextInt();	//numero de fotos
		int t  = sc.nextInt();	//tempo para cada foto
		int tt = n * t;			//tempo total = número de fotos x tempo para cada foto 
		int ok=1;
		int a=0;				//tempo de inicio
		int b=0;				//tempo de fim
		
		for (int i=0 ; i<n ; i++){
			a = sc.nextInt();
			b = sc.nextInt();
		
			if (a>0 && a<=10000 && b>0 && b<=100000 && a+t<=b && b<=1000000000)
				if (tt<=b)
					ok=1;
				else
					ok=0;
		}
		if (ok==1)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
