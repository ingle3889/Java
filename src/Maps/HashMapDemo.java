package Maps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class HashMapDemo {
	
	static String name, str;
	static long phno;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Long> hm =new HashMap();
		
		
		while(true) 
		{
			System.out.println("Add new contact in dictonary : Press 1");
			System.out.println("Enter the name to get phone number: Press 2 ");
			int a =Integer.parseInt(br.readLine());
			switch(a)
			{
				case 1: System.out.println("Enter the name :");
				name = br.readLine();
				System.out.println("Enter the contact number :");
				str = br.readLine();
				phno = new Long(str);
				hm.put(name, phno);
				break;
				
				case 2: System.out.println("Enter the name :");
				name = br.readLine();
				name = name.trim();
				try {
					phno = hm.get(name);
				} catch (NullPointerException e) {
					// TODO Auto-generated catch block
					System.out.println("Invalid name enter");
					break;
				}
				System.out.println("Phone number is "+phno);
				break;
				
				case 3: return;
				
				
			} 

				
			
		}
		
		

	}

}
