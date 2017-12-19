package RFPlayground;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FuFam {
	
	private static String s;
	
	
	 public static void main(String[] args){
		 
		 Scanner in = new Scanner(System.in);
		 s = in.nextLine(); 
		 testSaveContent("test.txt", s);
		 
		 
	 }
	 
	 private static void testSaveContent(String fileName, String s) {

		 try{    

		 FileWriter fw=new FileWriter(fileName);    

		 fw.write(s);    

		 fw.close();    

		 System.out.println("Success! File \""+fileName+"\" saved!");

		 }catch(IOException e){

		 System.out.println("An IOException was thrown. \nCheck to see that the directory where you tried to save the file actually exists.");

		 }

		     

		 }
	 
}
