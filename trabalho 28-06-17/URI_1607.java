/*
+--------------------+
| Rodrigo CavanhaMan |
|        IFTM        |
|      URI 1607      |
+--------------------+
*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int contaA=0;
		int N = sc.nextInt();
		for (int i=0 ; i<N ; i++){

			String A = sc.next();
			String B = sc.next();

			char[] A1 = A.toCharArray();
			char[] B1 = B.toCharArray();
			
			for (int x=0 ; x<A1.length ; x++){
				while(A1[x] != B1[x]){
					contaA++;
					if(A1[x]+1 > 122)
						A1[x]-=25;
					else
						A1[x]+=1;
				}
			}
			System.out.println(contaA);
			contaA=0;
		}
		sc.close();
	}
}