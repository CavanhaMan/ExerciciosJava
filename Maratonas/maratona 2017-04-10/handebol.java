import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class handebol {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int jogador, partida, gol, contagol=0, contajogador=0;
		
		jogador = sc.nextInt();
		partida = sc.nextInt();
		
		for (int f = 0; f < jogador; f++){
			for (int i = 0; i < partida; i++){
				gol = sc.nextInt();
				if (gol > 0)
					contagol++;
			}

			if (contagol == partida){
				contajogador++;
			}
			contagol = 0;			
		}
		System.out.println(contajogador);
		sc.close();
	}
}