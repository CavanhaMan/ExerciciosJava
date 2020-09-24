/*
╔════════════════════╗
║ Rodrigo CavanhaMan ║
║        IFTM        ║
║      URI 1024      ║
╚════════════════════╝
*/
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int i;
		int N = sc.nextInt();
		
		sc.nextLine();
		
		for(i=0 ; i<N ; i++){
			String str = sc.nextLine();
			char[] s = str.toCharArray();
			System.out.println(s);
		}
		sc.close();
	}
	
	public static boolean letra(char c){
		return c>='a' && c<='z' && c>='A' && c<='Z'
	}

		for(i=0 ; i<v.length ; i++)
			if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'))
				v[i]+=3;

/*		char v[] = s.toCharArray();
		s = Arrays.toString(v);
		s = new StringBuilder(s).reverse().toString();
		
		v = s.toCharArray();
		
		for(i=0 ; i<v.length ; i++)
			if (v[i] == ',')
				v[i]=' ';

		for(i=(v.length/2) ; i<v.length ; i++)
				v[i]-=1;

		for(i=0 ; i<s.length() ; i++)
			System.out.printf("%s",v[i]);
		
		s = Arrays.toString(v);
		for(i=0 ; i<s.length() ; i++)
			if (v[i] == ',')
				v[i]=' ';

		System.out.println(s);
		
		
		sc.close();
	}

}*/
