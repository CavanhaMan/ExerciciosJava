package aplicacao;
/*-----------------*
|Rodrigo CavanhaMan|
|Exercicios em Java|
*------------------*/
import java.util.Scanner;
import java.util.Locale;

public class Exercicio3 {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("SISTEMA DE PERFIL DE CLIENTE\n");
		System.out.printf("--------------------------------\n");
		System.out.printf("INFORME OS DADOS DO ÚLTIMO ANO\n\n");
		System.out.printf("Quantas compras o cliente fez no último ano? ");
		int quantasCompras = sc.nextInt();
		System.out.printf("Qual o ticket médio? ");
		float ticketMedio = sc.nextFloat();
		System.out.println();
		System.out.printf("Quantas vezes o cliente atrasou o pagamento? ");
		int atrasoPagamento = sc.nextInt();
		System.out.printf("A maioria das compras foi em dinheiro, cartão, ou boleto (D/C/B)? ");
		char formaPagamento = sc.next().charAt(0);
		System.out.println();
		
		int sVolume=0;
		if (quantasCompras == 0) sVolume = 0;
		else {
			if (ticketMedio <= 3000 && quantasCompras <= 2)
				sVolume = 20;
			else if (ticketMedio <= 3000 && quantasCompras > 2)
				sVolume = 40;
			else if (ticketMedio > 3000)
				sVolume = 60;
		}
		System.out.printf("Score de volume de compras = %d pontos\n", sVolume);
		System.out.println();
		
		int sInadimplencia=0;
		if (atrasoPagamento>1 || quantasCompras==0)  sInadimplencia = 0;
		else if (atrasoPagamento==1 && quantasCompras>0) sInadimplencia = 15;
		else if (atrasoPagamento==0 && quantasCompras>0) sInadimplencia = 30;
		System.out.printf("Score de inadimplência = %d pontos\n", sInadimplencia);
		
		int sPagamento=0;
		if (quantasCompras>0 && (formaPagamento=='D' || formaPagamento=='d')) sPagamento=5;
		else if (quantasCompras>0 && (formaPagamento=='C' || formaPagamento=='c' || formaPagamento=='B' || formaPagamento=='b')) sPagamento=10;
		System.out.printf("Score de forma de pagamento = %d pontos\n", sPagamento);
		
		System.out.println();

		String cFinal=""; 
		int sTotal = sVolume + sInadimplencia + sPagamento;
		if (sTotal <= 25) cFinal = "BRONZE"; 
		if (sTotal >25 && sTotal <= 75) cFinal = "PRATA";
		if (sTotal > 75) cFinal = "OURO";
		System.out.printf("Classificação final = CLIENTE %S\n", cFinal); 

		sc.close();
	}
}
/*
4
679.82
1
C

 */
