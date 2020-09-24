import java.util.Scanner;

public class hexadecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int decimal;
		System.out.printf("Forneça um número decimal:");
		decimal = sc.nextInt();
		
        String hexa = Integer.toHexString(decimal);  
        System.out.printf("O valor %d na base 10 em hexadecimal é: %s\n",decimal,hexa); 
        
        sc.close();
	}

}
