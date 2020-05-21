/*
+--------------------------+
|    Rodrigo CavanhaMan    |
|           IFTM           |
|  Sistemas para Internet  |
+--------------------------+
*/
import java.util.Locale;
import java.util.Scanner;

public class glicose {

	/**
	* Imprime na tela a classificação da glicose recebida, de acordo com
	* a seguinte tabela de referência: (1) Até 100mg/dl = Normal;
	* (2) Maior que 100 até 140mg/dl = Elevado; (3) Maior que 140mg/dl = Diabetes
	* @param g Medida de glicose em mg/dl
	*/
	public static void classificarGlicose(double g){
		if (g==0)
			System.out.println("FIM\n");
		else if(g<=100)
			System.out.println("Normal\n");
		else if(g>100 && g<=140)
			System.out.println("Elevado\n");
		else
			System.out.println("Diabetes\n");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		double glicose=1;
		
		while(glicose!=0){
			System.out.printf("(Digite 0 para sair)\n");
			System.out.printf("Digite o valor da quantidade de glicose no sangue do paciente:");
			glicose = sc.nextDouble();
			classificarGlicose(glicose);
		}
		sc.close();
	}
		

}
