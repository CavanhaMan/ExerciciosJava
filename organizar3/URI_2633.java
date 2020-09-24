/*-------------------*
| Rodrigo CavanhaMan |
|        IFTM        |
|      URI 2633      |
*--------------------*/
import java.util.Scanner;

public class URI_2633 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){		
			int posicao=0, menor=1000;
			int N = Integer.parseInt(sc.next());
			
			if(N>=0 && N<=10){
		
				String[] carnes = new String[N];
				int[] validade = new int[N];
				int[] resultado = new int[N];
				sc.nextLine();
				for(int i=0 ; i<N ; i++){
					carnes[i]   = sc.next();
					validade[i] = Integer.parseInt(sc.next());
				}
	
				for(int w=0 ; w<N ; w++)
					if(validade[w]>=0 && validade[w]<=50){
						
						int fim=1, res=0;
						
						if (N==1)
							System.out.printf("%s\n",carnes[0]);
						else{
							for(int i=0 ; i<N ; i++)
								for(int y=0 ; y<N ; y++)
									if(i!=y)
										if (validade[i] == validade[y])
											validade[y]++;
			
							while (fim==1){
						
								menor = 1000;
								for(int i=0 ; i<N ; i++){
									if (menor > validade[i]){
										menor = validade[i];
										posicao = i;
									}
									else if (menor==1000)
										fim=0;
								}
								//System.out.printf("%s ",carnes[posicao]);
								if (res<N)
									resultado[res]=posicao;
								res++;
								
								validade[posicao]=1000;
							}
							for (int y=0 ; y<N-1 ; y++)
								System.out.printf("%s ",carnes[resultado[y]]);
							System.out.printf("%s\n",carnes[resultado[N-1]]);
			
						}
					}
			}
		}
		sc.close();
	}
}