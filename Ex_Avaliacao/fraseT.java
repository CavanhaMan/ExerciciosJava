import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String frase = sc.nextLine();
		String[] newFrase = frase.split(" ");
		
		for (int i=0 ; i<newFrase.length ; i++) {
			if (newFrase[i].length()>3)
				System.out.println(newFrase[i].substring(0,3));
		}
		//System.out.print(String.join("\n", newFrase));
		sc.close();
	}

}
/*
Faça um programa que recebe como entrada uma frase T.
O programa deverá imprimir as 3 primeiras letras de todas as 
palavras, que tenham mais de 3 caracteres, presentes na frase T.
obs.:
- Não considerar acentos.
- Considerar o “ponto e virgula” como parte das palavras.

Exemplo:

Entrada:
Nos nao vemos as coisas como elas sao, mas como nos somos.

Saída
vem
coi
com
ela
sao
com
som

*/