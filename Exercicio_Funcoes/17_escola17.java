/*-------------------------*
|    Rodrigo CavanhaMan    |
|           IFTM           |
|  Sistemas para Internet  |
|                          |
|       EXERCICIO 17       |
*--------------------------*/
import java.util.Locale;
import java.util.Scanner;

public class escola17 {

	public static double calculaNota (double nota1, double nota2, double nota3){
		return nota1+nota2+(nota3*2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		/* 3 tri
		 * cda um vale 25
		 * ultimo tem o dobro do peso das duas primeiras
		 * ler as 3 notas e mostrar a nota final
		 * aprovado ou reprovado.
		 * (reprovado < 70) */
		
		double n1, n2, n3, nota;
		
		System.out.printf("Forneça a 1ª nota:");
		n1 = sc.nextDouble();
		System.out.printf("Forneça a 2ª nota:");
		n2 = sc.nextDouble();
		System.out.printf("Forneça a 3ª nota:");
		n3 = sc.nextDouble();
		
		nota = calculaNota(n1,n2,n3);
		
		System.out.printf("Nota total: %.2f\n",nota);
		
		if(nota >= 70)
			System.out.println("Aluno aprovado");
		else
			System.out.println("Aluno reprovado");

		
		sc.close();
	}

}
