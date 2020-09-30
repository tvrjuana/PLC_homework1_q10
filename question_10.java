import java.io.*;
public class question_10 {

	public static void main(String[] args) throws Exception {
	// Checks a source file (input file in plain text format) that separates lexemes by white space and 
	// special characters and alphanumeric strings
	// Programming language concepts - Homework 1 09/30/2020
	
	
	try (FileReader file = new FileReader("C:\\Users\\tvrju\\OneDrive\\Desktop\\input_file.txt")) {
		int i;
		
		while ((i = file.read()) != -1) {
				if((i >= 'A' && i <= 'Z') ||(i >= 'a' && i <= 'z') || (i >= '0' && i <= '9')) 
					System.out.print((char) i);
				else 
					System.out.println("\n" +(char)i);
				
			}
	}
	}

}
