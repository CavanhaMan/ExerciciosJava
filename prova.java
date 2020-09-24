/*-------------------------*
|    Rodrigo CavanhaMan    |
|           IFTM           |
|  Sistemas para Internet  |
*--------------------------*/
import java.util.Locale;
import java.util.Scanner;

public class prova {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int N = sc.nextInt();
		double[] salarios = new double[N];
		String[] nomes = new String[N];
		
		entraDados(nomes, salarios);
		double mediasal = calculaMedia(salarios);
		mostraAbaixoMedia(nomes, salarios, mediasal);
		
		sc.close();
	}

	public static void mostraAbaixoMedia(String[] nomes, double[] salarios, double media){
		System.out.println("Salários abaixo da média:");
		for(int i=0 ; i<salarios.length ; i++)
			if(salarios[i]<media)
				System.out.println(nomes[i]);
	}
	
	public static void entraDados(String[] nomes, double[] salarios){
		Scanner sc = new Scanner(System.in);
		System.out.println("Forneça o nome e o salários de cada funcionário:");
		for(int i=0 ; i<salarios.length ; i++){
			nomes[i]=sc.next();
			salarios[i]=sc.nextDouble();
		}
		sc.close();
	}
	
	public static double calculaMedia(double[] salarios){
		double soma=0;
		for(int i=0 ; i<salarios.length ; i++)
			soma+=salarios[i];
		System.out.printf("A média salarias dos funcionários é %.2f\n",soma/salarios.length);
		return (soma/salarios.length);
	}
}
