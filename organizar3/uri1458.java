/*
╔════════════════════╗
║ Rodrigo CavanhaMan ║
║        IFTM        ║
║      URI 1458      ║
╚════════════════════╝
*/
import java.util.Scanner;

public class uri1458 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//#  se repetir letra #=1x
		//30cm/10decimos pra mover
		//2décimos pra digitar
		//início 4 e 6
		
		double tempo=0;
		String entrada;
		
		while(sc.hasNext()){
			entrada = sc.nextLine();
			
			StringBuilder teste = new StringBuilder(entrada);
			
			char entr[] = entrada.toCharArray();
			for(int i=1 ; i<entr.length ; i++)
				if (entr[i-1]==entr[i])
					teste.insert(entrada.length() - 2, '#');
			
/*			char entradaFinal[] = teste.toCharArray();
			
			for(int i=0 ; i<teste.length ; i++){
				switch (teste[i]){
				//2  a=1x  b=2x  c=3x
				case 'a' : tempo+=2; break;
				case 'b' : tempo+=4; break;
				case 'c' : tempo+=6; break;
				//3  d=1x  e=2x  f=3x
				case 'd' : tempo+=2; break;
				case 'e' : tempo+=4; break;
				case 'f' : tempo+=6; break;
				//4  g=1x  h=2x  i=3x
				case 'g' : tempo+=2; break;
				case 'h' : tempo+=4; break;
				case 'i' : tempo+=6; break;
				//5  j=1x  k=2x  l=3x
				case 'j' : tempo+=2; break;
				case 'k' : tempo+=4; break;
				case 'l' : tempo+=6; break;
				//6  m=1x  n=2x  o=3x
				case 'm' : tempo+=2; break;
				case 'n' : tempo+=4; break;
				case 'o' : tempo+=6; break;
				//7  p=1x  q=2x  r=3x  s=4x
				case 'p' : tempo+=2; break;
				case 'q' : tempo+=4; break;
				case 'r' : tempo+=6; break;
				case 's' : tempo+=8; break;
				//8  t=1x  u=2x  v=3x
				case 't' : tempo+=2; break;
				case 'u' : tempo+=4; break;
				case 'v' : tempo+=6; break;
				//9  w=1x  x=2x  y=3x  z=4x
				case 'w' : tempo+=2; break;
				case 'x' : tempo+=4; break;
				case 'y' : tempo+=6; break;
				case 'z' : tempo+=8; break;
				//0  espaço=1x
				case ' ' : tempo+=2; break;
				//#  espaço=1x
				case '#' : tempo+=2; break;
				}
			}
			int resH = (int)tempo/10;
			double resM=entr.length;
			resM = resM/10;
			resM += (tempo%10);
			resM = resM/10;
			double resultado = resH+resM;
			System.out.println(resultado);
			
			tempo=0;resH=0;resM=0;resultado=0;
	*/	}
		sc.close();
	}
}