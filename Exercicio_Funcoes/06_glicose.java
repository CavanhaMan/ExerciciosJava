/*-------------------------*
|    Rodrigo CavanhaMan    |
|           IFTM           |
|  Sistemas para Internet  |
*--------------------------*/
import java.util.Locale;
import java.util.Scanner;

public class glicose2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		double glicose=1;
		
		while(glicose!=0){
			System.out.printf("(Digite 0 para sair)\n");
			System.out.printf("Digite o valor da quantidade de glicose no sangue do paciente:");
			glicose = sc.nextDouble();
			
			classificarGlicose.classifica(glicose);
		}
		sc.close();
	}
		

}
