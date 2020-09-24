import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int i, l, c;
		int MENU=0;
		double excedente;
		int N = sc.nextInt();
		String[] nome = new String[N];
		String[] fone = new String[N];
		int[] tipo = new int[N];
		int[] pulsos = new int[N];
		double[] conta = new double[N];
		double[][] preco = new double[3][2];
		
		//ENTRADA DE TADOS
		for(i=0 ; i<N ; i++){
			System.out.printf("Insira o nome do %dº cliente: ",i+1);
			nome[i]=sc.next();
			System.out.printf("Insira o telefone de %s: ",nome[i]);
			fone[i]=sc.next();
			System.out.printf("Insira o tipo de assinatura de %s: ",nome[i]);
			tipo[i]=sc.nextInt();
			System.out.printf("Insira a quantidade de pulsos gastos por %s: ",nome[i]);
			pulsos[i]=sc.nextInt();
		}
		
		//s3 = String.format("%-80s", s3);
		//ENTRADA DAS TARIFAS
		for(i=0 ; i<3 ; i++){
			System.out.printf("Forneça o valor do preço básico da %dª assinatura: ",i+1);
			preco[i][0]=sc.nextDouble();
			System.out.printf("Forneça o valor dos pulsos excedentes da %dª assinatura: \n",i+1);
			preco[i][1]=sc.nextDouble();
			}

		//CALCULA EXCEDENTE
		for(i=0 ; i<N ; i++){
			if(pulsos[i]<=90)
				conta[i]=preco[tipo[i]][0];
			else{
				excedente = pulsos[i]-90;
				conta[i]=preco[tipo[i]][0]+(excedente*preco[tipo[i]][1]);
			}
		}
		
		for(i=0 ; i<N ; i++){
			System.out.println(String.format("Nome %18s",nome[i]));
			System.out.println(String.format("Telefone %16s",fone[i]));
			System.out.println(String.format("Tipo %12d",tipo[i]));
			System.out.println(String.format("Pulsos %12d",pulsos[i]));
			System.out.println(String.format("Valor da Conta %6.2f\n",conta[i]));
		}
		//String.format("%-80s"
//s3 = String.format("%-80s", s3);
//			System.out.printf("N[%d] = %d\n",z,vet[z]);
		
		
		
		
		//************* MENU *******************************************
		while(MENU!=7){
			System.out.println("___Escolha_uma_das_opções_do_Menu:_______________________________");
			System.out.println("1) A receita total da empresa telefônica (soma de todas as contas)");
			System.out.println("2) Nome e telefone do cliente do qual a conta foi mais barata (supor não haver empates)");
			System.out.println("3) Média de pulsos consumidos por clientes de conta tipo 1");
			System.out.println("4) Nomes e telefones dos clientes que não consumiram pulsos excedentes");
			System.out.println("5) A quantidade de clientes que consumiu acima de 120 pulsos");
			System.out.println("6) A porcentagem de clientes que possuem conta tipo 2, em relação ao total de clientes");
			System.out.println("7) Sair\n");
			MENU=sc.nextInt();
			
			if(MENU==1){
				double receita=0;
				for(i=0 ; i<N ; i++)
					receita+=conta[i];
				System.out.printf("A receita total da empresa telefônica é: R$ %.2f\n\n",receita);
			}
			if(MENU==2){
				double MENOR=conta[0];
				int posicaoM=0;
				for(i=0 ; i<N ; i++)
					if(conta[i]<MENOR){
						MENOR=conta[i];
						posicaoM=i;
					}
				System.out.printf("A conta mais barata é a do(a) cliente: %s, fone: %s\n\n",nome[posicaoM],fone[posicaoM]);
			}
			if(MENU==3){
				int SOMA=0,MEDIA=0;
				for(i=0 ; i<N ; i++)
					if(tipo[i]==1){
						SOMA++;
						MEDIA+=pulsos[i];
					}
				MEDIA=MEDIA/SOMA;
				System.out.printf("A média de pulsos consumido por clientes tipo 1 é: %d\n\n",MEDIA);
			}
			if(MENU==4){
				System.out.printf("Clientes que não consumiram pulsos excedentes:\n");
				for(i=0 ; i<N ; i++)
					if(pulsos[i]<=90){
						System.out.println(String.format("Nome %18s",nome[i]));
						System.out.println(String.format("Telefone %16s",fone[i]));
					}
				System.out.printf("\n\n");
			}
			if(MENU==5){
				System.out.printf("Clientes com pulsos excedentes acima de 120:\n");
				for(i=0 ; i<N ; i++)
					if(pulsos[i]>120){
						System.out.println(String.format("Nome %18s",nome[i]));
						System.out.println(String.format("Telefone %16s",fone[i]));
					}
				System.out.printf("\n\n");
			}
			if(MENU==6){
				int conta2=0;
				double x=0.0;
				for(i=0 ; i<N ; i++)
					if(tipo[i]==2)
						conta2++;
				x=(conta2*100)/N;
				System.out.printf("A porcentagem de clientes que possuem conta tipo 2 é: %.2f%%\n\n",x);
			}
			if(MENU==7)
				sc.close();
			if(MENU>7)
				System.out.println("Opção inválida\n\n");
		}

		
		
		
		sc.close();
	}
}