import java.util.Scanner;

public class retangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int base, altura, area, perimetro;
		
		base = sc.nextInt();
		altura = sc.nextInt();
		area = base*altura;
		perimetro = base + base + altura + altura;
		System.out.println("�rea = " + area);
		System.out.println("Per�metro = " + perimetro);
		
		sc.close();
		
	}

}
