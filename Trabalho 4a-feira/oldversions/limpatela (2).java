import java.util.Locale;
import java.util.Scanner;

public class limpatela {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int i;
		String enter;
		int N = sc.nextInt();
		String[] nome = new String[N];
		String[] fone = new String[N];
		int[] tipo = new int[N];
		int[] pulsos = new int[N];
		double[] conta = new double[N];
		
		for(i=0 ; i<N ; i++){
			System.out.printf("Insira o nome do %dº cliente: \n",i+1);
			nome[i]=sc.next();
			System.out.printf("Insira o telefone de %s: \n",nome[i]);
			fone[i]=sc.next();
			System.out.printf("Insira o tipo de assinatura de %s: \n",nome[i]);
			tipo[i]=sc.nextInt();
			System.out.printf("Insira a quantidade de pulsos gastos por %s: \n",nome[i]);
			pulsos[i]=sc.nextInt();
		}
		
		

		
		//*************************************
		for (i=0; i<100; i++)
		    System.out.println();
		System.out.printf("\n");
		System.out.printf("Pressione <ENTER> para continuar...\n");
		enter=sc.next();
		//***************************************
		
		
		
		
		System.out.printf("%18s","Nome");
		System.out.printf("%12s","Telefone");
		System.out.printf("%6s","Tipo");
		System.out.printf("%8s","Pulsos");
		System.out.printf("%16s","Valor da Conta");
		System.out.printf("\n");
		for(i=0 ; i<N ; i++){
			System.out.printf("%18s",nome[i]);
			System.out.printf("%12s",fone[i]);
			System.out.printf("%6d",tipo[i]);
			System.out.printf("%8d",pulsos[i]);
			System.out.printf("%16.2f",conta[i]);
			System.out.printf("\n");
		}
		
		//String.format("%-80s"
//s3 = String.format("%-80s", s3);
//			System.out.printf("N[%d] = %d\n",z,vet[z]);
		sc.close();
	}
}