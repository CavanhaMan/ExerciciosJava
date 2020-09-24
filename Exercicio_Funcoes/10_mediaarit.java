/*-------------------------*
|    Rodrigo CavanhaMan    |
|           IFTM           |
|  Sistemas para Internet  |
|                          |
|       EXERCICIO 10       |
*--------------------------*/
import java.util.Locale;
import java.util.Scanner;

public class mediaarit {

	/**
	* Faz a leitura do vetor inteiro a partir da entrada padrao
	* @param vetor - recebe o vetor a receber os valores
	*/	public static void lervetor(double[] vetor){
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		for(int i=0 ; i<vetor.length ; i++)
			vetor[i] = sc.nextInt();
		//sc.close(); está dando erro no segundo vetor!
	}

	/**
	 * Calcula a média aritmética entre cada elemento dos vetores
	 * @param a recebe valor i do vetor A
	 * @param b recebe valor i do vetor B
	 * @param c recebe valor i do vetor C
	 * @param d recebe valor i do vetor D
	 */
	public static void calculaMedia(double[] a, double[] b, double[] c, double[] d){
		for(int i=0 ; i<d.length ; i++)
			d[i] = (a[i]+b[i]+c[i])/3;
	}

	/**
	 * Imprime o vetor resultado D
	 * @param d recebe o vetor a ser impresso
	 */
	public static void imprimirD(double[] d){
		for(int i=0 ; i<d.length ; i++)
			System.out.printf("%2.1f  ",d[i]);
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos valores vc vai digitar?");
		int N = sc.nextInt();
		
		double[] A = new double[N];
		double[] B = new double[N];
		double[] C = new double[N];
		double[] D = new double[N];
				
		System.out.println("Forneça o vetor A:");
		lervetor(A);

		System.out.println("Forneça o vetor B:");
		lervetor(B);
		
		System.out.println("Forneça o vetor C:");
		lervetor(C);
		
		calculaMedia(A,B,C,D);
		
		System.out.println("A média aritmética para cada elemento é: ");
		imprimirD(D);
			
	sc.close();
	}
}