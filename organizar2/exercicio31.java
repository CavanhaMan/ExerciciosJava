import java.util.Scanner;

	public class exercicio31 {

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);

			double x=1, soma=0, quant=0; 
			double media;
			
			while (x > 0){
				x = sc.nextDouble();
				if (x > 0){
					soma = soma + x;
					quant++;
				}
			}

			if (soma == 0){
				System.out.println("impossivel calcular");
			}
			else {
				media = soma/quant;
				System.out.printf("%.2f\n",media);
			}
			sc.close();
		}
	}
//https://sites.google.com/a/iftm.edu.br/nelio/logica-de-programacao