
//import java.io.File;
import java.util.Scanner;
public class texto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("\r\n");
		String html = "", auxHR="";
		
		while (scanner.hasNext()) {
			String line = scanner.nextLine();
			line += " ";
			html += line;
			//String line = scanner.next();
		    //String cells[] = line.split("\t");                          
		    //System.out.println(cells.length);
			html = html.replaceAll(" <|> ","#");
			html = html.replaceAll("<|>","#");
			html = html.replaceAll("#br#","\n");
			html = html.replaceAll("#hr##hr#","#h2r#");
			while(html.indexOf("#hr#") != -1){
				auxHR = ("\n");
				for (int hr=0 ; hr<80 ; hr++)
					auxHR += ("-");
				auxHR += ("\n");
				html = html.replaceFirst("#hr#",auxHR);
				}
			while(html.indexOf("#h2r#") != -1){
				auxHR = ("\n");
				for (int hr=0 ; hr<80 ; hr++)
					auxHR += ("-");
				auxHR += ("\n");
				for (int hr=0 ; hr<80 ; hr++)
					auxHR += ("-");
				auxHR += ("\n");
				html = html.replaceFirst("#h2r#",auxHR);
				}

		    System.out.println(html);
		}

	}

}
