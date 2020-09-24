import java.util.Scanner;
public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		
		int x, y, soma;
		
		System.out.println("Por favor forneça o valor de X");
		
		x = sc.nextInt();
		
		System.out.println("Por favor forneça o valor de y");
		
		y = sc.nextInt();

		soma = x + y;
		System.out.println("Este é o valor de X que foi digitado:" + x);
		System.out.println("Este é o valor de y que foi digitado:" + y);
		
		System.out.println("Este é o valor da soma:" + soma);
		System.out.println("Este é o valor da média:" + (soma/2));
		

		if(x<y){
			System.out.println("X é MENOR que Y");
	
		}
		if(x>y){
			System.out.println("X é MAIOR que Y");			
		}
		
		if(x==y){
			System.out.println("X é IGUAL a Y");			
		}

		System.out.println("Agradecemos pela atenção! Tenha uma boa noite!");
	}

}
