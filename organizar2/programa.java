import java.util.Scanner;
public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		
		int x, y, soma;
		
		System.out.println("Por favor forne�a o valor de X");
		
		x = sc.nextInt();
		
		System.out.println("Por favor forne�a o valor de y");
		
		y = sc.nextInt();

		soma = x + y;
		System.out.println("Este � o valor de X que foi digitado:" + x);
		System.out.println("Este � o valor de y que foi digitado:" + y);
		
		System.out.println("Este � o valor da soma:" + soma);
		System.out.println("Este � o valor da m�dia:" + (soma/2));
		

		if(x<y){
			System.out.println("X � MENOR que Y");
	
		}
		if(x>y){
			System.out.println("X � MAIOR que Y");			
		}
		
		if(x==y){
			System.out.println("X � IGUAL a Y");			
		}

		System.out.println("Agradecemos pela aten��o! Tenha uma boa noite!");
	}

}
