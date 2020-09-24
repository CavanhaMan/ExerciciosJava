/* Rodrigo CavanhaMan */
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma;
		int N = sc.nextInt();
		int[][] A = new int[N][N];
		int[] vet = new int[N];
		
		for(int i=0 ; i<N ; i++)
			for(int j=0 ; j<N ; j++)
				A[i][j] = sc.nextInt();
		
		for(int i=0 ; i<N ; i++){
			soma=0;
			for(int j=0 ; j<N ; j++){
				soma+=A[i][j];
				vet[i] = soma;
			}
		}
		
		for(int i=0 ; i<N ; i++)
			System.out.printf("%3d",vet[i]);		

	}
}
