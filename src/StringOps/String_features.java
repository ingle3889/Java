package StringOps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_features {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Reads input form keyboard
		System.out.println("Enter your word to lowercase");
		String s = br.readLine();
		
		// method converts the string into Lowercase
		String s1 = lowercasetest(s);
		System.out.println("Lowercase :"+ s1);
		
		// method converts the string into Uppercase
		String s2 = Uppercasetest(s);
		System.out.println("Uppercase :"+ s2);
		
		// method returns the length of string 
		int s3 = lengthcheck(s);
		System.out.println("Uppercase :"+ s3);
		
		

	}
	
	static int lengthcheck(String s) {
		// TODO Auto-generated method stub
		return s.length();
	}

	static String lowercasetest(String s) 
	{
		return s.toLowerCase();
		
	}
	static String Uppercasetest(String s) 
	{
		return s.toUpperCase();
		
	}

}
