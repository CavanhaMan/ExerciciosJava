import java.util.Locale;
import java.util.Scanner;

public class candidatos {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int maior=0;
		int vPolvo=0, vSerrote=0, vCiranda=0;
		int N = sc.nextInt();
		
		String[] candidato = new String[N];
		int[] voto = new int[N];
		
	
			for(int i=0 ; i<N ; i++){
					candidato[i]=sc.next();
					voto[i]=sc.nextInt();
			}

			for(int i=0 ; i<N ; i++){
				if(candidato[i].equals("Polvo"))
					vPolvo+=voto[i];
				if(candidato[i].equals("Serrote"))
					vSerrote+=voto[i];
				if(candidato[i].equals("Ciranda"))
					vCiranda+=voto[i];
			}

			System.out.println("Polvo " + vPolvo);
			System.out.println("Serrote " + vSerrote);
			System.out.println("Ciranda " + vCiranda);
			
			if (vPolvo > vSerrote)
				maior=1;
			else if (vSerrote > vCiranda)
				maior=2;
			else
				maior=3;
				
			if (maior==1)
				System.out.println("Vencedor: Polvo");
			if (maior==2)
				System.out.println("Vencedor: Serrote");
			if (maior==3)
				System.out.println("Vencedor: Ciranda");
			

		sc.close();
		}
	}