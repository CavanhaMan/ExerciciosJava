/*
+--------------------------+
|    Rodrigo CavanhaMan    |
|           IFTM           |
|  Sistemas para Internet  |
+--------------------------+
*/
	/**
	* Imprime na tela a classifica��o da glicose recebida, de acordo com
	* a seguinte tabela de refer�ncia: (1) At� 100mg/dl = Normal;
	* (2) Maior que 100 at� 140mg/dl = Elevado; (3) Maior que 140mg/dl = Diabetes
	* @param g Medida de glicose em mg/dl
	*/
	public class classificarGlicose {
		
		
		public static void classifica(double g) {
			if (g==0)
				System.out.println("FIM\n");
			else if(g<=100)
				System.out.println("Normal\n");
			else if(g>100 && g<=140)
				System.out.println("Elevado\n");
			else
				System.out.println("Diabetes\n");
	
		}
	
	}
