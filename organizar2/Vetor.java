import java.util.Vector;	 //imports vector utility
import java.util.Scanner;  //imports scanner utillity
class Main{

	public static void main(String []args){

	Scanner scan = new Scanner(System.in);

	Vector<String> myVector=new Vector<String>(10,2); //declare vector

	String word="";		  //this string will be later added to the vector at 0


		//Fill vector
	for(int i=0;i<=myVector.size();i++){				 //this for loop will run for eternity, unless someone enters EXIT

		 System.out.print("\n Type EXIT to exit loop , Enter a word  :");

		 word=scan.nextLine();			   //reads in String from user

		  if(word.equals("EXIT")){				 //causes loop to exit
		break;

		  }

		 myVector.add(word);			 //adds word to vector
	
		 }//end of for loop


	//Display Contense
	for(int k=0;k<myVector.size();k++){		//I'll use a for loop to iterate through the array. The number of iterations is limited by the vector's size

	System.out.print("\n	  "+myVector.get(k));

	}
   }//end of main

}//end of class
