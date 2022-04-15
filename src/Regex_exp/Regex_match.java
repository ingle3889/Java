package Regex_exp;

import java.io.BufferedReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		
		String s = sc.nextLine();
		Pattern pattern = Pattern.compile(s,Pattern.CASE_INSENSITIVE);
		
		System.out.println("Enter the String you would like to find :");
		
		String s1 = sc.nextLine();
		Matcher matcher = pattern.matcher(s1);
		
		boolean matchfound = matcher.find();
		
		System.out.println(" ");
		if(!matchfound) 
		{
			System.out.println("Match found");
			
		}
		else 
		{
			System.out.println("match not found");
		}
	}

}
