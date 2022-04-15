package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee_main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number element to add in array ");
		int a = Integer.parseInt(br.readLine());
		Employee arr[] = new Employee[a];
		
		for(int i =0; i<a; i++) 
		{
			System.out.println("Enter you name :");
			String name = br.readLine();
			
			System.out.println("Enter the employee id");
			int a1 = Integer.parseInt(br.readLine());
			
			arr[i] = new Employee(name, a1);
		}
		
		System.out.println("Employee database as follows :");
		
		for(int i=0; i<arr.length; i++) 
		{
			System.out.println(" ");
			arr[i].display();
		}

	}

	
}
