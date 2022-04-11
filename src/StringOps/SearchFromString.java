package StringOps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchFromString {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the nuber of string");
		
		int n = Integer.parseInt(br.readLine());
		
		String [] s = new String [n]; 
		for(int i =0;i<n;i++) 
		{
			System.out.println("Enter the string");
			s[i]= br.readLine();
		} 

		System.out.println("Enter the string which want to find in string");

		String search = br.readLine();
		
		for (int i=0;i<n;i++) 
		{
			if(search.equalsIgnoreCase(s[i])) 
			{
				System.out.println("Searched string found at postion "+ i+1);
			}
		}
		

	}

}
