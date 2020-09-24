
public class testabela {

	public static void main(String[] args) {
		String s1 = "TESTE DE IMPRESSÃO COM ESPAÇOS";
		s1 = String.format("%-80s", s1);
		System.out.println(s1 + "   " + s1.length());
		String s2 = "Rodrigo";
		String s3 = "";
		s3 = String.format("%-80s", s3);
		int espaco=80-(s2.length());
		System.out.println(String.format("Teste %-80s.", s1));
		System.out.println(String.format("Teste %s.", s1));
		System.out.println(String.format("Teste %-80d.", espaco));
		System.out.println(String.format("Teste %-80d.", s2.length()));
		System.out.println(String.format("Teste %s.", s3));
		System.out.println(String.format("Teste %-80s.", s3));
		
		String s4 = "Rodrigo C Baltazar";
		s4 = String.format("%-20s", s3);
		System.out.println(String.format("Teste %s.", s4));

		}

}
