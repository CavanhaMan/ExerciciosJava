import java.util.Scanner;

public class Programa01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, soma, multiplica, media, triplox, triploy;
		
		System.out.println("Informe o valor de X:");
		x = sc.nextInt();
		System.out.println("Informe o valor de Y:");
		y = sc.nextInt();
		
		soma = x + y;
		media = soma/2;
		multiplica = x * y;
		triplox = x * 3;
		triploy = y * 3;
		
		System.out.println("A soma dos valores: " + soma);
		System.out.println("A multiplica��o dos valores: " + multiplica);
		System.out.println("A m�dia dos valores: " + media);

		if(x > y){
			System.out.println("X � MAIOR que Y");
		}
		else if(x < y){
			System.out.println("X � MENOR que Y");
		}
		else if(x == y){
			System.out.println("X � IGUAL a Y");
		}

		System.out.println("O triplo de X: " + triplox);

		System.out.println("O triplo de Y: " + triploy);
		
		sc.close();
	}

}
