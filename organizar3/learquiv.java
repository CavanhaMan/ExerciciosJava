import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class learquiv {

	public static void main (String aFileName) {

	    String file = aFileName;
	    String line = null; // string to read line by line

	    try {
	        FileReader fr = new FileReader(file);
	        BufferedReader br = new BufferedReader(fr);

	        while ((line = br.readLine()) != null) {
	            System.out.println(line);

	            if (line.matches("\r\n")) {
	                System.out.println("it has");
	            }
	            if (line.matches("\n")) {
	                System.out.println("bu");
	            }
	        }
	        br.close();
	    }
	    catch (FileNotFoundException e) {
	        System.out.println("Unable to open file " + file + "!");
	    }
	    catch (IOException e) {
	        e.printStackTrace();
	    }
	}

}
