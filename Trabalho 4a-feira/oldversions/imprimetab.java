import java.util.Locale;
import java.util.Scanner;

public class imprimetab {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int i, l, c;
		double excedente;
		int N = sc.nextInt();
		String[] nome = new String[N];
		String[] fone = new String[N];
		int[] tipo = new int[N];
		int[] pulsos = new int[N];
		double[] conta = new double[N];
		double[][] preco = new double[3][2];
		
		for(i=0 ; i<N ; i++){
			System.out.printf("Insira o nome do %dº cliente: ",i+1);
			nome[i]=sc.next();
			System.out.printf("Insira o telefone de %s: ",nome[i]);
			fone[i]=sc.next();
			System.out.printf("Insira o tipo de assinatura de %s: ",nome[i]);
			tipo[i]=sc.nextInt();
			System.out.printf("Insira a quantidade de pulsos gastos por %s: ",nome[i]);
			pulsos[i]=sc.nextInt();
		}
		
		//s3 = String.format("%-80s", s3);
		System.out.printf("\n");

		
		for(i=0 ; i<N ; i++){
			System.out.println(String.format("Nome %18s",nome[i]));
			System.out.println(String.format("Telefone %16s",fone[i]));
			System.out.println(String.format("Tipo %12d",tipo[i]));
			System.out.println(String.format("Pulsos %12d",pulsos[i]));
			System.out.println(String.format("Valor da Conta %6.2f",conta[i]));
		}
		//String.format("%-80s"
//s3 = String.format("%-80s", s3);
//			System.out.printf("N[%d] = %d\n",z,vet[z]);
		sc.close();
	}
}