/*
╔════════════════════╗
║ Rodrigo CavanhaMan ║
║        IFTM        ║
║      URI 2653      ║
╚════════════════════╝
*/
import java.util.Scanner;

public class URI_2653 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		
		for (int y=0 ; y<N ; y++){
			int contaJoia=0, troca=1;
			String joia="";
			joia = sc.nextLine();
		
			joia = joia.replaceAll("[.]","");
			//System.out.println(joia);
				
			while(troca==1){
				if(joia.indexOf("<>") != -1){ //Se for diferente de -1 é pq existe o caracter.
					contaJoia++;
					joia = joia.replaceFirst("<>","");
				}
				else
					troca=0;
			}
			System.out.println(contaJoia);
		}
		sc.close();
	}

}